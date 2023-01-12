package com.miportfolio.springboot.controller;

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

import com.miportfolio.springboot.model.educacion.Educacion;
import com.miportfolio.springboot.model.experiencia.Experiencia;
import com.miportfolio.springboot.model.habilidades.Habilidades;
import com.miportfolio.springboot.model.persona.Persona;
import com.miportfolio.springboot.model.proyecto.Proyecto;
import com.miportfolio.springboot.services.educacionServ.IEducacionService;
import com.miportfolio.springboot.services.experienciaServ.IExperienciaService;
import com.miportfolio.springboot.services.habilidadesServ.IHabilidadesService;
import com.miportfolio.springboot.services.personaServ.IPersonaService;
import com.miportfolio.springboot.services.proyectoServ.IProyectoServices;

@RestController
public class Controller {

    @Autowired 
    private IExperienciaService expServ;
    @Autowired 
    private IEducacionService eduServ;
    @Autowired 
    private IHabilidadesService habServ;
    @Autowired 
    private IPersonaService persoServ;
    @Autowired 
    private IProyectoServices proyServ;

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
    public void crea( @RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> traerExperiencia(){
        return expServ.verExperiencias();
    }

    @DeleteMapping("/borrar/experiencia/{id}")
    public void borrarExperiencia(@PathVariable int id){
        expServ.borrarExperiencia(id);
    }
    
    @GetMapping("/pruebaRespuesta")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Esto es un mensaje ResponseEntity", HttpStatus.OK);
    }

    @GetMapping("/buscar/experiencia/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable int id){
        return expServ.buscarExperiencia(id);
    }

    //////////////////////////////////////////////////

    @PostMapping("/nueva/habilidad")
    public void agregarHabilidad( @RequestBody Habilidades hab){
        habServ.crearHabilidades(hab);
    }
    
    @GetMapping("/ver/habilidad")
    @ResponseBody
    public List<Habilidades> traerHabilidad(){
        return habServ.verHabilidades();
    }

    @DeleteMapping("/borrar/habilidad/{id}")
    public void borrarHabilidad(@PathVariable int id){
        habServ.borrarHabilidad(id);
    }

    @GetMapping("/buscar/habilidad/{id}")
    @ResponseBody
    public Habilidades buscarHabilidad(@PathVariable int id){
        return habServ.buscarHabilidad(id);
    }
    
    //////////////////////////////////////////////////

    @PostMapping("/nueva/educacion")
    public void agregarEducacion( @RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> traerEducacion(){
        return eduServ.verEducacion();
    }

    @DeleteMapping("/borrar/educacion/{id}")
    public void borrarEducacion(@PathVariable int id){
        eduServ.borrarEducacion(id);
    }

    @GetMapping("/buscar/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable int id){
        return eduServ.buscarEducacion(id);
    }
    //////////////////////////////////////////////////

    @PostMapping("/nueva/persona")
    public void agregarPersona( @RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Persona> traerPersona(){
        return persoServ.verPersonas();
    }

    @DeleteMapping("/borrar/persona/{id}")
    public void borrarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
    }

    @GetMapping("/buscar/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }

    //////////////////////////////////////////////////

    @PostMapping("/nueva/proyecto")
    public void agregarProyecto( @RequestBody Proyecto proy){
        proyServ.crearProyectos(proy);
    }
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> traeProyectos(){
        return proyServ.verProyectos();
    }

    @DeleteMapping("/borrar/proyecto/{id}")
    public void borrarProyecto(@PathVariable int id){
        proyServ.borrarProyecto(id);
    }

    @GetMapping("/buscar/proyecto/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable int id){
        return proyServ.buscarProyecto(id);
    }
    

}