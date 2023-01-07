package com.miportfolio.springboot.services.habilidadesServ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolio.springboot.model.habilidades.Habilidades;
import com.miportfolio.springboot.repository.habilidadesRepository;

@Service
public class HabilidadesService implements IHabilidadesService{

  @Autowired
  public habilidadesRepository habRepo;
  
  @Override
  public List<Habilidades> verHabilidades() {
    return this.habRepo.findAll();
  }

  @Override
  public void crearHabilidades(Habilidades hab) {
    this.habRepo.save(hab);
    
  }

  @Override
  public void borrarHabilidad(int id) {
    this.habRepo.deleteById(id);    
  }

  @Override
  public Habilidades buscarHabilidad(int id) {
    return this.habRepo.findById(id).orElse(null);
  }

  
  
}
