package com.clinica_veterinaria_tfg_api.domain.service;

import com.clinica_veterinaria_tfg_api.domain.dto.ClienteDTO;
import com.clinica_veterinaria_tfg_api.domain.repository.ClienteDTORepository;
import com.clinica_veterinaria_tfg_api.persistence.crud.ClienteCrudRepository;
import com.clinica_veterinaria_tfg_api.persistence.entity.Cliente;
import com.clinica_veterinaria_tfg_api.persistence.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteDTOService implements ClienteDTORepository {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    @Autowired
    private ClienteMapper mapper;

    @Override
    public ClienteDTO save(ClienteDTO dto) {
        Cliente cliente = mapper.toCliente(dto);
        return mapper.toClienteDTO(clienteCrudRepository.save(cliente));
    }


    @Override
    public List<ClienteDTO> getAll() {
        return mapper.toClientesDTO((List<Cliente>)clienteCrudRepository.findAll());
    }

    @Override
    public Optional<ClienteDTO> getById(String id) {
        return clienteCrudRepository.findById(id).map(cliente -> {
            return mapper.toClienteDTO(cliente);
        });
    }

    @Override
    public ClienteDTO update(ClienteDTO dto, String id) {
        ClienteDTO dtoToSave = getById(id).get();
        dtoToSave.setNombre(dto.getNombre());
        dtoToSave.setApellidos(dto.getApellidos());
        dtoToSave.setFechaNac(dto.getFechaNac());
        dtoToSave.setMascotas(dto.getMascotas());
        dtoToSave.setCitas(dto.getCitas());
        Cliente cliente = mapper.toCliente(dtoToSave);

        return mapper.toClienteDTO(clienteCrudRepository.save(cliente));
    }

    @Override
    public boolean delete(String id) {
        return getById(id).map(clienteDTO -> {
            clienteCrudRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
