package com.clinicaveterinariatfgapi.domain.service;

import com.clinicaveterinariatfgapi.domain.dto.CitaDTO;
import com.clinicaveterinariatfgapi.domain.repository.CitaDTORepository;
import com.clinicaveterinariatfgapi.persistence.crud.CitaCrudRepository;
import com.clinicaveterinariatfgapi.persistence.entity.Cita;
import com.clinicaveterinariatfgapi.persistence.mapper.CitaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaDTOService implements CitaDTORepository {

    @Autowired
    private CitaCrudRepository citaCrudRepository;

    @Autowired
    private CitaMapper mapper;

    @Override
    public CitaDTO save(CitaDTO dto) {
        Cita cita = mapper.toCita(dto);
        return mapper.toCitaDTO(citaCrudRepository.save(cita));
    }

    @Override
    public List<CitaDTO> getAll() {
        return mapper.toCitasDTO((List<Cita>)citaCrudRepository.findAll());
    }

    @Override
    public Optional<CitaDTO> getById(Long id) {
        return citaCrudRepository.findById(id).map(cita -> {
            return mapper.toCitaDTO(cita);
        });
    }

    @Override
    public CitaDTO update(CitaDTO dto, Long id) {
        CitaDTO citaToSave = getById(id).get();
        citaToSave.setFecha(dto.getFecha());
        citaToSave.setCliente(dto.getCliente());
        citaToSave.setMascota(dto.getMascota());
        citaToSave.setVeterinario(dto.getVeterinario());
        citaToSave.setChipMascota(dto.getChipMascota());
        citaToSave.setDniCliente(dto.getDniCliente());
        citaToSave.setDniVeterinario(dto.getDniVeterinario());

        Cita cita = mapper.toCita(citaToSave);

        return mapper.toCitaDTO(citaCrudRepository.save(cita));
    }

    @Override
    public boolean delete(Long id) {
        return getById(id).map(citaDTO -> {
            citaCrudRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
