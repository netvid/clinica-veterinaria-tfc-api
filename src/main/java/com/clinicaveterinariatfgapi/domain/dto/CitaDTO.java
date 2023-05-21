package com.clinicaveterinariatfgapi.domain.dto;

import com.clinicaveterinariatfgapi.persistence.entity.Cliente;
import com.clinicaveterinariatfgapi.persistence.entity.Mascota;
import com.clinicaveterinariatfgapi.persistence.entity.Veterinario;
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

    private ClienteDTO cliente;
    private VeterinarioDTO veterinario;
    private MascotaDTO mascota;
}
