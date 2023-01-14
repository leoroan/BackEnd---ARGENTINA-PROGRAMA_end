package com.miportfolio.springboot.model.Authorization;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Autorizacion {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String user;
  private String password;  

  public Autorizacion() {
  }

  public Autorizacion(String user, String password) {
    this.user = user;
    this.password = password;
  }


}




