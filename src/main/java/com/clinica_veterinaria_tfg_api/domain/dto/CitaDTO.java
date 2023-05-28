package com.clinica_veterinaria_tfg_api.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CitaDTO {
    private Long id;
    private String fecha;
    private String dniCliente;
    private String dniVeterinario;
    private String chipMascota;

}
