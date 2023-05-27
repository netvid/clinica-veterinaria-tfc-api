package com.clinica_veterinaria_tfg_api.domain.repository;

import com.clinica_veterinaria_tfg_api.domain.dto.VeterinarioDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VeterinarioDTORepository {

    VeterinarioDTO save(VeterinarioDTO dto);

    List<VeterinarioDTO> getAll();
    Optional<VeterinarioDTO> getById(String id);

    VeterinarioDTO update(VeterinarioDTO dto, String id);

    boolean delete(String id);
}
