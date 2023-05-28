package com.clinica_veterinaria_tfg_api.web.controller;

import com.clinica_veterinaria_tfg_api.domain.dto.CitaDTO;
import com.clinica_veterinaria_tfg_api.domain.dto.MascotaDTO;
import com.clinica_veterinaria_tfg_api.domain.service.CitaDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cites")
public class CitaController {

    @Autowired
    private CitaDTOService service;

    @GetMapping("/all")
    public ResponseEntity<List<CitaDTO>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CitaDTO> getById(@PathVariable Long id) {
        return service.getById(id).map(mascotaDTO -> {
            return new ResponseEntity<>(mascotaDTO, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<CitaDTO> save(@RequestBody CitaDTO dto){
        return new ResponseEntity<>(service.save(dto),HttpStatus.CREATED);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<CitaDTO> udpate(@PathVariable Long id, @RequestBody CitaDTO dto){
        return new ResponseEntity<>(service.update(dto,id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
        if(service.delete(id)) return new ResponseEntity(HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
