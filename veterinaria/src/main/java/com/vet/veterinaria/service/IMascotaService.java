package com.vet.veterinaria.service;

import com.vet.veterinaria.dto.MascotaDuenioDTO;
import com.vet.veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
    // ALTA
    public void saveMascota(Mascota mascota);
    
    // BAJA
    public void deleteMascota(Long idMascota);
    
    // MODIFICACION
    public void editMascota(Mascota mascota);
    
    // LECUTRA
    public Mascota findMascota(Long idMascota);
    
    public List<Mascota> getMascotas();
    
    // ENCONTRAR CANICHES
    public List<Mascota> getMascotasCaniche();
    
    // OBTENER MASCOTADUENIO
    
    public MascotaDuenioDTO getMascotaDTO(Long idMascota);
}
