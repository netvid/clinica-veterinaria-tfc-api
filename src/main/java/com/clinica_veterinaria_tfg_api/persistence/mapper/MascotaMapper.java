package com.clinica_veterinaria_tfg_api.persistence.mapper;


import com.clinica_veterinaria_tfg_api.domain.dto.MascotaDTO;
import com.clinica_veterinaria_tfg_api.persistence.entity.Mascota;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CitaMapper.class})
public interface MascotaMapper {

    @Mappings({
            @Mapping(source = "mascChip",target = "chip"),
            @Mapping(source = "mascNombre",target = "nombre"),
            @Mapping(source = "mascTipo",target = "tipo"),
            @Mapping(source = "mascRaza",target = "raza"),
            @Mapping(source = "cliDni", target = "dniCliente")
    })
    MascotaDTO toMascotaDTO(Mascota mascota);
    List<MascotaDTO> toMascotasDTO(List<Mascota> mascotas);

    @InheritInverseConfiguration
    Mascota toMascota(MascotaDTO dto);
}
