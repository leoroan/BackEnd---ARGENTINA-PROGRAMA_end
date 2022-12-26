package com.miportfolio.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolio.springboot.model.educacion.Educacion;

@Repository
public interface educacionRepository extends JpaRepository< Educacion, Integer>{
  
}
