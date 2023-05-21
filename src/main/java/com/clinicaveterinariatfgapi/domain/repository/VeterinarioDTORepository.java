package com.clinicaveterinariatfgapi.domain.repository;

import com.clinicaveterinariatfgapi.domain.dto.VeterinarioDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VeterinarioDTORepository {

    VeterinarioDTO save(VeterinarioDTO dto);

    List<VeterinarioDTO> getAll();
    Optional<VeterinarioDTO> getById(String id);

    void update(VeterinarioDTO dto, String id);

    boolean delete(String id);
}
