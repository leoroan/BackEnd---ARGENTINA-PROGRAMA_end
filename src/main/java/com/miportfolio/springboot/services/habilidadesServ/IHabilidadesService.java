package com.miportfolio.springboot.services.habilidadesServ;

import java.util.List;

import com.miportfolio.springboot.model.habilidades.Habilidades;

public interface IHabilidadesService {

  public List<Habilidades> verHabilidades();

  public void crearHabilidades (Habilidades hab);

  public void borrarHabilidad (int id);

  public Habilidades buscarHabilidad (int id);

  
}
