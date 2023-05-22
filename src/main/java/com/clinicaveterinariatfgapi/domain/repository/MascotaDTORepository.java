package com.clinicaveterinariatfgapi.domain.repository;

import com.clinicaveterinariatfgapi.domain.dto.MascotaDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MascotaDTORepository {

    MascotaDTO save(MascotaDTO dto);

    List<MascotaDTO> getAll();

    Optional<MascotaDTO> getById(String id);

    MascotaDTO update(MascotaDTO dto, String id);

    boolean delete(String id);
}
