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

@Table(name = "mascotas")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mascota implements Serializable {
    private final Long serialVersionUID = 1L;

    /* ============= ENTITIES  ============= */
    @Id
    @Column(name = "masc_chip")
    private String mascChip;

    @Column(name = "masc_tipo")
    private String mascTipo;

    @Column(name = "masc_raza")
    private String mascRaza;

    @Column(name = "cli_dni")
    private String cliDni;

    /* ============= RELATIONS ============= */
}
