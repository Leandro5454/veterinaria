package com.vet.veterinaria.controller;

import com.vet.veterinaria.dto.MascotaDuenioDTO;
import com.vet.veterinaria.model.Mascota;
import com.vet.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    IMascotaService mascotaService;
    
    // ALTA
    @PostMapping("/mascota/crear")
    public void createMascota(@RequestBody Mascota mascota) {
        mascotaService.saveMascota(mascota);
    }
    
    // BAJA
    @DeleteMapping("/mascota/eliminar")
    public void deleteMascota(@RequestParam Long idMascota) {
        mascotaService.deleteMascota(idMascota);
    }
    
    // MODIFICACION
    @PutMapping("/mascota/editar")
    public void editMascota(@RequestBody Mascota mascota) {
        mascotaService.editMascota(mascota);
    }

    // LECTURA
    @GetMapping("/mascota/obtener")
    @ResponseBody
    public Mascota findMascota(@RequestParam Long idMascota) {
        return mascotaService.findMascota(idMascota);
    }
    
    @GetMapping("/mascota/obtenerTodos")
    @ResponseBody
    public List<Mascota> getMascotas() {
        return mascotaService.getMascotas();
    }
    
    // ENCONTRAR CANICHES
    
    @GetMapping("/mascota/obtenerCaniches")
    @ResponseBody
    public List<Mascota> getMascotasCaniche() {
        return mascotaService.getMascotasCaniche();
    }
    
    // OBTENER MASCOTADUENIODTO
    
    @GetMapping("/mascota/obtenerDTO")
    @ResponseBody
    public MascotaDuenioDTO obtenerMascotaDuenioDTO(@RequestParam Long idMascota) {
        return mascotaService.getMascotaDTO(idMascota);
    }
}
