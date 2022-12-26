package com.miportfolio.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolio.springboot.model.proyecto.Proyecto;

@Repository
public interface proyectoRepository extends JpaRepository< Proyecto, Integer>{
  
}
