package com.clinica_veterinaria_tfg_api.persistence.mapper;


import com.clinica_veterinaria_tfg_api.domain.dto.VeterinarioDTO;
import com.clinica_veterinaria_tfg_api.persistence.entity.Veterinario;
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
            @Mapping(source = "vetSector",target = "sector"),
            @Mapping(source = "vetFechaNac", target = "fechaNac")
    })
    VeterinarioDTO toVeterinarioDTO(Veterinario veterinario);

    List<VeterinarioDTO> toVeterinariosDTO(List<Veterinario> veterinarios);

    @InheritInverseConfiguration
    Veterinario toVeterinario(VeterinarioDTO dto);
}
