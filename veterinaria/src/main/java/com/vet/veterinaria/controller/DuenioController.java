package com.vet.veterinaria.controller;

import com.vet.veterinaria.model.Duenio;
import com.vet.veterinaria.service.IDuenioService;
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
public class DuenioController {
    
    @Autowired
    IDuenioService duenioServ;
    
    // ALTA
    @PostMapping("/duenio/crear")
    public void createDuenio(@RequestBody Duenio duenio) {
        duenioServ.saveDuenio(duenio);
    }
    
    // BAJA
    @DeleteMapping("/duenio/eliminar")
    public void deleteDuenio(@RequestParam Long idDuenio) {
        duenioServ.deleteDuenio(idDuenio);
    }
    
    // MODIFICACION
    @PutMapping("/duenio/editar")
    public void editDuenio(@RequestBody Duenio duenio) {
        duenioServ.editDuenio(duenio);
    }

    // LECTURA
    @GetMapping("/duenio/obtener")
    @ResponseBody
    public Duenio findDuenio(@RequestParam Long idDuenio) {
        return duenioServ.findDuenio(idDuenio);
    }
    
    @GetMapping("/duenio/obtenerTodos")
    @ResponseBody
    public List<Duenio> getDuenios() {
        return duenioServ.getDuenios();
    }
}
