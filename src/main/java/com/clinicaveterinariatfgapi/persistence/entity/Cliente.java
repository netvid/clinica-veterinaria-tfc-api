package com.clinicaveterinariatfgapi.persistence.entity;

import jakarta.persistence.*;
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
