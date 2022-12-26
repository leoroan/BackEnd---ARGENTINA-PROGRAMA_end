package com.miportfolio.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String titulo_puesto;
  private String periodo_Trabajado;
  private String logo_url;
  private String descripcion;    

  public Experiencia() {
  }

  public Experiencia(int id, String titulo_puesto, String periodo_Trabajado, String logo_url, String descripcion) {
    this.id = id;
    this.titulo_puesto = titulo_puesto;
    this.periodo_Trabajado = periodo_Trabajado;
    this.logo_url = logo_url;
    this.descripcion = descripcion;
  }
  
}
