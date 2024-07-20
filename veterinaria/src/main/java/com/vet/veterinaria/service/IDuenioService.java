package com.vet.veterinaria.service;

import com.vet.veterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    
    // ALTA
    public void saveDuenio(Duenio duenio);
    
    // BAJA
    public void deleteDuenio(Long idDuenio);
    
    // MODIFICACION
    public void editDuenio(Duenio duenio);
    
    // LECTURA
    public Duenio findDuenio(Long idDuenio);
    
    public List<Duenio> getDuenios();
}
