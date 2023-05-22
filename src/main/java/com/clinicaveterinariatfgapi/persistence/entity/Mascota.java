package com.clinicaveterinariatfgapi.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Table(name = "mascotas")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mascota implements Serializable {
    private static final Long serialVersionUID = 1L;

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
    @ManyToOne
    @JoinColumn(name = "cli_dni",insertable = false, updatable = false)
    private Cliente cliente;


    @OneToMany(mappedBy = "mascota")
    private List<Cita> citas;
}
