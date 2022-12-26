package com.miportfolio.springboot.services.educacionServ;

import java.util.List;

import com.miportfolio.springboot.model.educacion.Educacion;

public interface IEducacionService {

  public List<Educacion> verEducacion();

  public void crearEducacion (Educacion edu);

  public void borrarEducacion (int id);

  public Educacion buscarEducacion (int id);
  
}
