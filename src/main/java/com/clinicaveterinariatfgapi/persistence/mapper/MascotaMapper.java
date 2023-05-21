package com.clinicaveterinariatfgapi.persistence.mapper;


import com.clinicaveterinariatfgapi.domain.dto.MascotaDTO;
import com.clinicaveterinariatfgapi.persistence.entity.Mascota;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MascotaMapper {

    MascotaDTO toMascotaDTO(Mascota mascota);
    List<MascotaDTO> toMascotasDTO(List<Mascota> mascotas);

    @InheritInverseConfiguration
    Mascota toMascota(MascotaDTO dto);
}
