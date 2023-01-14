package com.miportfolio.springboot.services.autorizacionServ;

import java.util.List;

import com.miportfolio.springboot.model.Authorization.Autorizacion;

public interface IAutorizacionService {

  public void crearAutorizacion (Autorizacion edu);

  public void borrarAutorizacion (int id);

  public List<Autorizacion> verAutorizaciones();

  
}
