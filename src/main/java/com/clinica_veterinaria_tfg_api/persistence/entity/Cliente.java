package com.clinica_veterinaria_tfg_api.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;


@Entity
@Table(name = "clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable {

    /* ============= ENTITIES  ============= */
    @Id
    @Column(name = "cli_dni")
    @Size(min = 9, max = 9, message = "The id must be contains 9 characters")
    private String cliDni;

    @Column(name = "cli_nombre")
    private String cliNombre;

    @Column(name = "cli_apellidos")
    private String cliApellidos;

    @Column(name = "cli_fecha_nac")
    private Date cliFechaNac;


    /* ============= RELATIONS ============= */
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
    List<Mascota> mascotas;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    List<Cita> citas;
}
