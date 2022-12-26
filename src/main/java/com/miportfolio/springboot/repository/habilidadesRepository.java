package com.miportfolio.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolio.springboot.model.habilidades.Habilidades;

@Repository
public interface habilidadesRepository extends JpaRepository< Habilidades, Integer>{
  
}