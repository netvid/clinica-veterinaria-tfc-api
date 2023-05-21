package com.clinicaveterinariatfgapi.persistence.mapper;


import com.clinicaveterinariatfgapi.domain.dto.ClienteDTO;
import com.clinicaveterinariatfgapi.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mappings({
            @Mapping(source = "cliDni", target = "dni"),
            @Mapping(source = "cliNombre", target = "nombre"),
            @Mapping(source = "cliApellidos",target = "apellidos"),
            @Mapping(source = "cliFechaNac", target = "fechaNac")
    })
    ClienteDTO toClienteDTO(Cliente cliente);

    List<ClienteDTO> toClientesDTO(List<Cliente> clientes);

    @InheritInverseConfiguration
    Cliente toCliente(ClienteDTO dto);
}
