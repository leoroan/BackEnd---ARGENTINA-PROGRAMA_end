package com.miportfolio.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String nombre_habilidad;
  private int porcentaje;
  private String priodo;
  private String descripcion;
  
  public Habilidades() {
  }

  public Habilidades(int id, String nombre_habilidad, int porcentaje, String priodo, String descripcion) {
    this.id = id;
    this.nombre_habilidad = nombre_habilidad;
    this.porcentaje = porcentaje;
    this.priodo = priodo;
    this.descripcion = descripcion;
  }


}
