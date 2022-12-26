package com.miportfolio.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miportfolio.springboot.model.experiencia;

@Repository
public interface experienciaRepository extends JpaRepository< experiencia, Integer>{

}
