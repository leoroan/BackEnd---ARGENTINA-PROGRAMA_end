package com.miportfolio.springboot.services;

import java.util.List;

import com.miportfolio.springboot.model.Experiencia;

public interface IExperienciaService {

  public List<Experiencia> verExperiencias();

  public void crearExperiencia (Experiencia exp);

  public void borrarExperiencia (int id);

  public Experiencia buscarExperiencia (int id);


}