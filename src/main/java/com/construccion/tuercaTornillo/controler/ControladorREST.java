/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.construccion.tuercaTornillo.controler;

/**
 *
 * @author nava
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ControladorREST {
    @GetMapping("/index-pages")
    public String comienzo(){
        return "indexPages";
    }
}