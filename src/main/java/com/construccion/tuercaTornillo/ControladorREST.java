/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.construccion.tuercaTornillo;

/**
 *
 * @author nava
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorREST {
    @GetMapping("/")
    public String comienzo(){
        return "Hola banda en String alv";
    }
}