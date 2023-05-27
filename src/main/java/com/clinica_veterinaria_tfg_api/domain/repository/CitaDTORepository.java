package com.clinica_veterinaria_tfg_api.domain.repository;

import com.clinica_veterinaria_tfg_api.domain.dto.CitaDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CitaDTORepository {

    CitaDTO save(CitaDTO dto);

    List<CitaDTO> getAll();
    Optional<CitaDTO> getById(Long id);

    CitaDTO update(CitaDTO dto, Long id);

    boolean delete(Long id);
}
