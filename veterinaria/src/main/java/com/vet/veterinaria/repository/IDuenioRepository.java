package com.vet.veterinaria.repository;

import com.vet.veterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDuenioRepository extends JpaRepository<Duenio, Long>{
    
}
