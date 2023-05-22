package com.clinicaveterinariatfgapi.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Table(name = "clientes")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable {
    private static final Long serialVersionUID = 1L;

    /* ============= ENTITIES  ============= */
    @Id
    @Column(name = "cli_dni")
    private String cliDni;

    @Column(name = "cli_nombre")
    private String cliNombre;

    @Column(name = "cli_apellidos")
    private String cliApellidos;

    @Column(name = "cli_fecha_nac")
    private Date cliFechaNac;


    /* ============= RELATIONS ============= */
    @OneToMany(mappedBy = "cliente")
    private List<Mascota> mascotas;

    @OneToMany(mappedBy = "cliente")
    private List<Cita> citas;
}
