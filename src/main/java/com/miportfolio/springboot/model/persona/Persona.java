package com.miportfolio.springboot.model.persona;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String nombre;
  private String apellido;
  private String email;
  private String fecha_nac;
  private String titulo_actual;
  private String sobre_mi;
  private String contrasenia;
  private String linkedin;
  private String facebook;
  private String github;

  public Persona() {
  }

  public Persona(int id, String nombre, String apellido, String email, String fecha_nac, String titulo_actual,
      String sobre_mi, String contrasenia, String linkedin, String facebook, String github) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.fecha_nac = fecha_nac;
    this.titulo_actual = titulo_actual;
    this.sobre_mi = sobre_mi;
    this.contrasenia = contrasenia;
    this.linkedin = linkedin;
    this.facebook = facebook;
    this.github = github;
  }
  

  


  

  


}
