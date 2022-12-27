package com.miportfolio.springboot.services.educacionServ;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miportfolio.springboot.model.educacion.Educacion;
import com.miportfolio.springboot.repository.educacionRepository;

@Service
public class EducacionService implements IEducacionService{
  
  @Autowired
  public educacionRepository eduRepo;
  
  @Override
  public List<Educacion> verEducacion() {
    return eduRepo.findAll();
  }

  @Override
  public void crearEducacion(Educacion edu) {
    this.eduRepo.save(edu);    
  }

  @Override
  public void borrarEducacion(int id) {
    this.eduRepo.deleteById(id);    
  }

  @Override
  public Educacion buscarEducacion(int id) {
    return this.eduRepo.findById(id).orElse(null);
  }
  
}
