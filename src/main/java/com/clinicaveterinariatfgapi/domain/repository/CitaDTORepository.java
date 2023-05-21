package com.clinicaveterinariatfgapi.domain.repository;

import com.clinicaveterinariatfgapi.domain.dto.CitaDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CitaDTORepository {

    CitaDTO save(CitaDTO dto);

    List<CitaDTO> getAll();
    Optional<CitaDTO> getById(Long id);

    void update(CitaDTO dto, Long id);

    boolean delete(Long id);
}
