package com.vet.veterinaria.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idDuenio;
    
    private int DNI;
    private String nombre;
    private String apellido;
    private int celular;
    
    @OneToOne(mappedBy = "duenio")
    @JsonBackReference
    private Mascota mascota;

    public Duenio(Long idDuenio, int DNI, String nombre, String apellido, int celular, Mascota mascota) {
        this.idDuenio = idDuenio;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.mascota = mascota;
    }

    public Duenio() {
    }
}
