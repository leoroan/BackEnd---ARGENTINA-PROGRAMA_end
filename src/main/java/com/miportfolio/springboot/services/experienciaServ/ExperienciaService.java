package com.miportfolio.springboot.services.experienciaServ;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolio.springboot.model.experiencia.Experiencia;
import com.miportfolio.springboot.repository.experienciaRepository;

@Service
public class ExperienciaService implements IExperienciaService {

  @Autowired // nos permite hacer injeccion  de dependencia entre una clase sin tener q hacer muchas insntacias
  public experienciaRepository expRepo;

  @Override
  public List<Experiencia> verExperiencias() {
    return expRepo.findAll();     
  }

  @Override
  public void crearExperiencia(Experiencia exp) {
    expRepo.save(exp);    
  }

  @Override
  public void borrarExperiencia(int id) {
    expRepo.deleteById(id);
    
  }

  @Override
  public Experiencia buscarExperiencia(int id) {
    return expRepo.findById(id).orElse(null);
    
  }

}