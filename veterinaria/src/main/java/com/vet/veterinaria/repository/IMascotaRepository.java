package com.vet.veterinaria.repository;

import com.vet.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
}
