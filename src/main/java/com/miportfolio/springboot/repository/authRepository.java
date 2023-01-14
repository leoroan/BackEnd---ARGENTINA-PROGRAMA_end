package com.miportfolio.springboot.repository;

import org.springframework.stereotype.Repository;
import com.miportfolio.springboot.model.Authorization.Autorizacion;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface authRepository extends JpaRepository <Autorizacion, Integer>{
  
}

  
