package com.clinica_veterinaria_tfg_api.persistence.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Table(name = "veterinarios")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veterinario implements Serializable {
    private static final Long serialVersionUID = 1L;

    /* ============= ENTITIES  ============= */
    @Id
    @Column(name = "vet_dni")
    @Size(min = 9, max = 9, message = "The id must be contains 9 characters")
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
    @OneToMany(mappedBy = "veterinario", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    List<Cita> citas;
}
