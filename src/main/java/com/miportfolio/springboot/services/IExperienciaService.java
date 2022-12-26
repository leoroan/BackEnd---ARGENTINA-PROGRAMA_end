package com.miportfolio.springboot.services;

import java.util.List;

import com.miportfolio.springboot.model.experiencia;

public interface IExperienciaService {

  public List<experiencia> verExperiencias();

  public void crearExperiencia (experiencia exp);

  public void borrarExperiencia (int id);

  public experiencia buscarExperiencia (int id);


}