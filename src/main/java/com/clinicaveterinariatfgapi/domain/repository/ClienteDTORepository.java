package com.clinicaveterinariatfgapi.domain.repository;

import com.clinicaveterinariatfgapi.domain.dto.ClienteDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteDTORepository {
    ClienteDTO save(ClienteDTO dto);
    List<ClienteDTO> getAll();
    Optional<ClienteDTO> getById(String id);

    ClienteDTO update(ClienteDTO dto, String id);

    boolean delete(String id);
}
