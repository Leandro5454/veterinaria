package com.vet.veterinaria.service;

import com.vet.veterinaria.model.Duenio;
import com.vet.veterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    IDuenioRepository duenioRepo;
    
    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public void deleteDuenio(Long idDuenio) {
        duenioRepo.deleteById(idDuenio);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }

    @Override
    public Duenio findDuenio(Long idDuenio) {
        return duenioRepo.findById(idDuenio).orElse(null);
    }

    @Override
    public List<Duenio> getDuenios() {
        return duenioRepo.findAll();
    }
    
}
