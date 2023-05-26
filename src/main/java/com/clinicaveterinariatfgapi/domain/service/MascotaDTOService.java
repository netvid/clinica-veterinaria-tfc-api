package com.clinicaveterinariatfgapi.domain.service;

import com.clinicaveterinariatfgapi.domain.dto.MascotaDTO;
import com.clinicaveterinariatfgapi.domain.repository.MascotaDTORepository;
import com.clinicaveterinariatfgapi.persistence.crud.MascotaCrudRepository;
import com.clinicaveterinariatfgapi.persistence.entity.Mascota;
import com.clinicaveterinariatfgapi.persistence.mapper.MascotaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaDTOService implements MascotaDTORepository {

    @Autowired
    private MascotaCrudRepository mascotaCrudRepository;

    @Autowired
    private MascotaMapper mapper;


    @Override
    public MascotaDTO save(MascotaDTO dto) {
        Mascota mascota = mapper.toMascota(dto);
        return mapper.toMascotaDTO(mascotaCrudRepository.save(mascota));
    }

    @Override
    public List<MascotaDTO> getAll() {
        return mapper.toMascotasDTO((List<Mascota>)mascotaCrudRepository.findAll());
    }

    @Override
    public Optional<MascotaDTO> getById(String id) {
        return mascotaCrudRepository.findById(id).map(mascota -> {
            return mapper.toMascotaDTO(mascota);
        });
    }

    @Override
    public MascotaDTO update(MascotaDTO dto, String id) {
        MascotaDTO dtoToSave = getById(id).get();
        dtoToSave.setNombre(dto.getNombre());
        dtoToSave.setRaza(dto.getRaza());
        dtoToSave.setCitas(dto.getCitas());
        dtoToSave.setTipo(dto.getTipo());

        Mascota mascota = mapper.toMascota(dtoToSave);
        return mapper.toMascotaDTO(mascotaCrudRepository.save(mascota));
    }

    @Override
    public boolean delete(String id) {
        return getById(id).map(mascotaDTO -> {
            mascotaCrudRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
