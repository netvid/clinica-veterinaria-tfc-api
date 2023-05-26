package com.clinicaveterinariatfgapi.persistence.mapper;


import com.clinicaveterinariatfgapi.domain.dto.MascotaDTO;
import com.clinicaveterinariatfgapi.persistence.entity.Mascota;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CitaMapper.class})
public interface MascotaMapper {

    @Mappings({
            @Mapping(source = "mascChip",target = "chip"),
            @Mapping(source = "mascTipo",target = "tipo"),
            @Mapping(source = "mascRaza",target = "raza"),
            @Mapping(source = "cliDni", target = "dniCliente")
    })
    MascotaDTO toMascotaDTO(Mascota mascota);
    List<MascotaDTO> toMascotasDTO(List<Mascota> mascotas);

    @InheritInverseConfiguration
    Mascota toMascota(MascotaDTO dto);
}
