package com.miportfolio.springboot.services.personaServ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolio.springboot.model.persona.Persona;
import com.miportfolio.springboot.repository.personaRepository;

@Service
public class PersonaService implements IPersonaService{

  @Autowired
  public personaRepository persoRepo;

  @Override
  public List<Persona> verPersonas() {
   return this.persoRepo.findAll();
  }

  @Override
  public void crearPersona(Persona perso) {
    persoRepo.save(perso);    
  }

  @Override
  public void borrarPersona(int id) {
    this.persoRepo.deleteById(id);    
  }

  @Override
  public Persona buscarPersona(int id) {
    return this.persoRepo.findById(id).orElse(null);
  }



}
