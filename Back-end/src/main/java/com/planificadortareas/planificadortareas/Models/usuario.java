package com.planificadortareas.planificadortareas.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idUsuario", nullable = false, length = 36)
    private String idUsuario;

    @Column(name = "td" , nullable = false, length = 3)
    private String td;

    @Column(name = "documento", nullable = false, length = 11)
    private String  documento;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "nacimiento", nullable = false, length = 15)
    private Date nacimiento;

    @Column(name = "contrasena", nullable = false, length = 50)
    private String contrasena;

    @Column(name = "actualizacion", nullable = false, length = 15)
    private Date actualizacion;

    @Column(name = "iniciosesion", nullable = false, length = 15)
    private Date iniciosesion;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;
    
}