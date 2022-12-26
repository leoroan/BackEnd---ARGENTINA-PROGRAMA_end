package com.miportfolio.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miportfolio.springboot.model.experiencia;
import com.miportfolio.springboot.services.IExperienciaService;

@RestController
public class Controller {

    @Autowired 
    private IExperienciaService expServ;

//    @PathVariable:
//        los parámetros se brindan mediante diferentes
//        apartados path(“/”) de la dirección
//
//     ej: @GetMapping("/hola/{nombre})"  
//         public String saludar(@PathVariable String nombre){
//         return "hola" + nombre;
//         }   
//    
//    @RequestParam:
//        los datos se especifican dentro de un mismo path mediante 
//        el símbolo “?” y separando a cada uno de ellos mediante el símbolo “&”
//    mas info argprog > Mod 8 2021 - page 20
//
//      ej: @GetMapping("/hola/{nombre})"  
//         public String saludar(@RequestParam String nombre){
//         return "Chau" + nombre;
//         }  
//
    
// RESTARIA CREAR CON PUT Y DELETE
// @DeleteMapping @PutMapping

   
//    @GetMapping("/experiencia")
//    public String saludar(){
//        return "hola";
//    }
    

    @PostMapping("/nueva/experiencias")
    public void agregarExperiencia( @RequestBody experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<experiencia> traerExp(){
        return expServ.verExperiencias();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarExperiencia(@PathVariable int id){
        expServ.borrarExperiencia(id);
    }
    
    @GetMapping("/pruebaRespuesta")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Esto es un mensaje ResponseEntity", HttpStatus.OK);
    }

    
    

}