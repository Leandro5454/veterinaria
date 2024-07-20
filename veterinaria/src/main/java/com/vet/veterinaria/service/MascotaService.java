package com.vet.veterinaria.service;

import com.vet.veterinaria.dto.MascotaDuenioDTO;
import com.vet.veterinaria.model.Duenio;
import com.vet.veterinaria.model.Mascota;
import com.vet.veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository mascotaRepo;
    
    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long idMascota) {
        mascotaRepo.deleteById(idMascota);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    @Override
    public Mascota findMascota(Long idMascota) {
        return mascotaRepo.findById(idMascota).orElse(null);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public List<Mascota> getMascotasCaniche() {
        List<Mascota> mascotas = this.getMascotas();
        List<Mascota> mascotasCaniche = new ArrayList<>();
        
        for(Mascota mascota : mascotas) {
            if(mascota.getEspecie().equals("Perro") && mascota.getRaza().equals("caniche"))
                mascotasCaniche.add(mascota);
        }
        
        return mascotasCaniche;
    }

    @Override
    public MascotaDuenioDTO getMascotaDTO(Long idMascota) {
        MascotaDuenioDTO mascotaDuenioDTO = new MascotaDuenioDTO();
        Mascota mascota = this.findMascota(idMascota);
        Duenio duenio = mascota.getDuenio();
        
        mascotaDuenioDTO.setNombreMascota(mascota.getNombre());
        mascotaDuenioDTO.setEspecie(mascota.getEspecie());
        mascotaDuenioDTO.setRaza(mascota.getRaza());
        mascotaDuenioDTO.setNombreDuenio(duenio.getNombre());
        mascotaDuenioDTO.setApellidoDuenio(duenio.getApellido());
        
        return mascotaDuenioDTO;
    }
    
}
