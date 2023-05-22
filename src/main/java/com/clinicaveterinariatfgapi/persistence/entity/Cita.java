package com.clinicaveterinariatfgapi.persistence.entity;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
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
    private static final Long serialVersionUID = 1L;
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
    @ManyToOne
    @JoinColumn(name = "cli_dni",insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "vet_dni", insertable = false, updatable = false)
    private Veterinario veterinario;

    @ManyToOne
    @JoinColumn(name = "masc_chip", insertable = false, updatable = false)
    private Mascota mascota;

}
