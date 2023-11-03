/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.construccion.tuercaTornillo.REST;
import com.construccion.tuercaTornillo.controler.UsuarioControlador;
import com.construccion.tuercaTornillo.model.Usuarios;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author nava
 */
@RestController
@RequestMapping ("/api/persona/")
public class Usuarios_REST {
    @Autowired
	private UsuarioControlador usuarioControlador;
	
	@PostMapping
	private ResponseEntity<Usuarios> guardar (@RequestBody Usuarios usuarios){
		Usuarios temporal = usuarioControlador.create(usuarios);
		
		try {
			return ResponseEntity.created(new URI("/api/persona"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Usuarios>> listarTodasLasPersona (){
		return ResponseEntity.ok(usuarioControlador.getAllPersonas());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarUsuario (@RequestBody Usuarios usuarios){
		usuarioControlador.delete(usuarios);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Usuarios>> listarPersonasPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(usuarioControlador.findById(id));
	}
}
