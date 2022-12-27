package com.miportfolio.springboot.services.proyectoServ;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolio.springboot.model.proyecto.Proyecto;
import com.miportfolio.springboot.repository.proyectoRepository;

@Service
public class ProyectoService implements IProyectoServices {

  @Autowired
  public proyectoRepository proyRepo;

  @Override
  public List<Proyecto> verProyectos() {
    return this.proyRepo.findAll();
  }

  @Override
  public void crearProyectos(Proyecto proy) {
    this.proyRepo.save(proy);
  }

  @Override
  public void borrarProyecto(int id) {
    this.proyRepo.deleteById(id);
  }

  @Override
  public Proyecto buscarProyecto(int id) {
    return this.proyRepo.findById(id).orElse(null);
  }
  
}
