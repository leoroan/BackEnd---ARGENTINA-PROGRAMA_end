package com.miportfolio.springboot.services.proyectoServ;
import java.util.List;
import com.miportfolio.springboot.model.proyecto.Proyecto;

public interface IProyectoServices {

  public List<Proyecto> verProyectos();

  public void crearProyectos (Proyecto proy);

  public void borrarProyecto (int id);

  public Proyecto buscarProyecto (int id);


}
