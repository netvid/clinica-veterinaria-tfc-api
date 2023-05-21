package com.clinicaveterinariatfgapi.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Table(name = "veterinarios")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veterinario implements Serializable {
    private final Long serialVersionUID = 1L;


    /* ============= ENTITIES  ============= */
    @Id
    @Column(name = "vet_dni")
    private String vetDni;

    @Column(name = "vet_nombre")
    private String vetNombre;

    @Column(name = "vet_apellidos")
    private String vetApellidos;

    @Column(name = "vet_fecha_nac")
    private Date vetFechaNac;

    @Column(name = "vet_sector")
    private String vetSector;


    /* ============= RELATIONS ============= */
}