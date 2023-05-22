package com.clinicaveterinariatfgapi.domain.service;

import com.clinicaveterinariatfgapi.domain.dto.VeterinarioDTO;
import com.clinicaveterinariatfgapi.domain.repository.VeterinarioDTORepository;
import com.clinicaveterinariatfgapi.persistence.crud.VeterinarioCrudRepository;
import com.clinicaveterinariatfgapi.persistence.entity.Veterinario;
import com.clinicaveterinariatfgapi.persistence.mapper.VeterinarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioDTOService implements VeterinarioDTORepository {

    @Autowired
    private VeterinarioCrudRepository veterinarioCrudRepository;

    @Autowired
    private VeterinarioMapper mapper;

    @Override
    public VeterinarioDTO save(VeterinarioDTO dto) {
        Veterinario veterinario = mapper.toVeterinario(dto);
        return mapper.toVeterinarioDTO(veterinarioCrudRepository.save(veterinario));
    }

    @Override
    public List<VeterinarioDTO> getAll() {
        return mapper.toVeterinariosDTO((List<Veterinario>) veterinarioCrudRepository.findAll());
    }

    @Override
    public Optional<VeterinarioDTO> getById(String id) {
        return veterinarioCrudRepository.findById(id).map(veterinario -> {
            return mapper.toVeterinarioDTO(veterinario);
        });
    }

    @Override
    public VeterinarioDTO update(VeterinarioDTO dto, String id) {
        VeterinarioDTO dtoToSave = getById(id).get();;

        dtoToSave.setNombre(dto.getNombre());
        dtoToSave.setApellidos(dto.getApellidos());
        dtoToSave.setSector(dto.getSector());
        dtoToSave.setFechaNac(dto.getFechaNac());
        dtoToSave.setCitas(dto.getCitas());

        Veterinario veterinario = mapper.toVeterinario(dtoToSave);
        return mapper.toVeterinarioDTO(veterinarioCrudRepository.save(veterinario));
    }

    @Override
    public boolean delete(String id) {
        return getById(id).map(veterinarioDTO -> {
            veterinarioCrudRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
