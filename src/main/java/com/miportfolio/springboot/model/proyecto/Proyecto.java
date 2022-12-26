package com.miportfolio.springboot.model.proyecto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String nombre;
  private String descripcion;
  private String url_proyecto;
  private String url_foto;

  public Proyecto() {
  }

  public Proyecto(int id, String nombre, String descripcion, String url_proyecto, String url_foto) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.url_proyecto = url_proyecto;
    this.url_foto = url_foto;
  }

  

  

}
