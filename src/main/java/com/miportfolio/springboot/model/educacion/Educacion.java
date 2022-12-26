package com.miportfolio.springboot.model.educacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String nombre_instituto;
  private String url_logo;
  private String titulo;
  private String fecha_inicio;
  private String fecha_fin;

  public Educacion() {
  }

  public Educacion(int id, String nombre_instituto, String url_logo, String titulo, String fecha_inicio,
      String fecha_fin) {
    this.id = id;
    this.nombre_instituto = nombre_instituto;
    this.url_logo = url_logo;
    this.titulo = titulo;
    this.fecha_inicio = fecha_inicio;
    this.fecha_fin = fecha_fin;
  }

  

  

}
