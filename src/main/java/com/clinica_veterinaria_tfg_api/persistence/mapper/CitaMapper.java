package com.clinica_veterinaria_tfg_api.persistence.mapper;


import com.clinica_veterinaria_tfg_api.domain.dto.CitaDTO;
import com.clinica_veterinaria_tfg_api.persistence.entity.Cita;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CitaMapper {

    @Mappings({
            @Mapping(source = "citaId" , target = "id"),
            @Mapping(source = "citaFecha",target = "fecha"),
            @Mapping(source = "cliDni", target = "dniCliente"),
            @Mapping(source = "vetDni", target = "dniVeterinario"),
            @Mapping(source = "mascChip", target = "chipMascota")

    })
    CitaDTO toCitaDTO(Cita cita);

    List<CitaDTO> toCitasDTO(List<Cita> citas);

    @InheritInverseConfiguration
    Cita toCita(CitaDTO dto);
}
