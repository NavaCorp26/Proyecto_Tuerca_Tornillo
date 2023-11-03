/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.construccion.tuercaTornillo.controler;
import com.construccion.tuercaTornillo.model.Usuarios;
import com.construccion.tuercaTornillo.repository.UsuariosRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author nava
 */
@Service
public class UsuarioControlador {
    @Autowired (required = false)
	private UsuariosRepository usuarioRepository;
	
	
	public Usuarios create (Usuarios usuarios) {
		return usuarioRepository.save(usuarios);
	}
	
	public List<Usuarios> getAllPersonas (){
		return usuarioRepository.findAll();
	}
	
	public void delete (Usuarios usuarios) {
		usuarioRepository.delete(usuarios);
	}
	
	public Optional<Usuarios> findById (Long id) {
		return usuarioRepository.findById(id);
	}
}
