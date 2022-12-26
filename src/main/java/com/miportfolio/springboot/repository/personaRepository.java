package com.miportfolio.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolio.springboot.model.Persona;

@Repository
public interface personaRepository extends JpaRepository< Persona, Integer>{
  
}
