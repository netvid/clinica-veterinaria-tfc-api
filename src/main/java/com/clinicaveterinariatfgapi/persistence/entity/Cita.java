package com.clinicaveterinariatfgapi.persistence.entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Table(name = "citas")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cita implements Serializable {
    private final Long serialVersionUID = 1L;
    /* ============= ENTITIES  ============= */
    @Id
    @Column(name = "cita_id")
    private Long citaId;

    @Column(name = "cli_dni")
    private String cliDni;

    @Column(name = "cita_fecha")
    private String citaFecha;

    @Column(name = "vet_dni")
    private String vetDni;

    @Column(name = "masc_chip")
    private String mascChip;

    /* ============= RELATIONS ============= */

}
