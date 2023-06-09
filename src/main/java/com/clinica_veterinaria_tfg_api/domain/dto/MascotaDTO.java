package com.clinica_veterinaria_tfg_api.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MascotaDTO {
    private String chip;
    private String nombre;

    private String tipo;
    private String raza;
    private String dniCliente;
    private List<CitaDTO> citas;
}
