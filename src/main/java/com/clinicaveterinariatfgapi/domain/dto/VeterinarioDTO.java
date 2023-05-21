package com.clinicaveterinariatfgapi.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VeterinarioDTO {
    private String dni;
    private String nombre;

    private String apellidos;
    private String sector;
    private String fechaNac;

    private List<CitaDTO> citas;
}
