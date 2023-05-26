package com.clinicaveterinariatfgapi.persistence.mapper;


import com.clinicaveterinariatfgapi.domain.dto.VeterinarioDTO;
import com.clinicaveterinariatfgapi.persistence.entity.Veterinario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CitaMapper.class})
public interface VeterinarioMapper {
    @Mappings({
            @Mapping(source = "vetDni",target = "dni"),
            @Mapping(source = "vetNombre", target = "nombre"),
            @Mapping(source = "vetApellidos", target = "apellidos"),
            @Mapping(source = "vetFechaNac", target = "fechaNac"),
            @Mapping(source = "vetSector",target = "sector")
    })
    VeterinarioDTO toVeterinarioDTO(Veterinario veterinario);

    List<VeterinarioDTO> toVeterinariosDTO(List<Veterinario> veterinarios);

    @InheritInverseConfiguration
    Veterinario toVeterinario(VeterinarioDTO dto);
}
