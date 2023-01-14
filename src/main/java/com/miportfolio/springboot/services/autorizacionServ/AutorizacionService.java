package com.miportfolio.springboot.services.autorizacionServ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miportfolio.springboot.model.Authorization.Autorizacion;
import com.miportfolio.springboot.repository.authRepository;

@Service
public class AutorizacionService implements IAutorizacionService {

  @Autowired
  public authRepository authRepo;

  @Override
  public void crearAutorizacion(Autorizacion aut) {
    this.authRepo.save(aut);
  }

  @Override
  public void borrarAutorizacion(int id) {
    this.authRepo.deleteById(id);
  }

  @Override
  public List<Autorizacion> verAutorizaciones() {
    return authRepo.findAll();
  }

}
