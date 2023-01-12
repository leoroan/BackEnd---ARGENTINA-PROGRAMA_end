package com.miportfolio.springboot.services.personaServ;
import java.util.List;
import com.miportfolio.springboot.model.persona.Persona;

public interface IPersonaService {

  public List<Persona> verPersonas();

  public void crearPersona (Persona perso);

  public void borrarPersona (int id);

  public Persona buscarPersona (int id);

  
}
