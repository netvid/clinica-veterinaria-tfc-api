package com.clinicaveterinariatfgapi.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Table(name = "clientes")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable {
    private final Long serialVersionUID = 1L;

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
}
