package com.clinica_veterinaria_tfg_api.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fechaNac;

    private List<CitaDTO> citas;
    private List<MascotaDTO> mascotas;
}
