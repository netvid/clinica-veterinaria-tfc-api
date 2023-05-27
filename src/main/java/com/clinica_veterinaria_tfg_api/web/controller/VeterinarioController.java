package com.clinica_veterinaria_tfg_api.web.controller;

import com.clinica_veterinaria_tfg_api.domain.dto.CitaDTO;
import com.clinica_veterinaria_tfg_api.domain.dto.VeterinarioDTO;
import com.clinica_veterinaria_tfg_api.domain.service.VeterinarioDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinaries")
public class VeterinarioController {

    @Autowired
    private VeterinarioDTOService service;

    @GetMapping("/all")
    public ResponseEntity<List<VeterinarioDTO>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeterinarioDTO> getById(@PathVariable String id) {
        return service.getById(id).map(mascotaDTO -> {
            return new ResponseEntity<>(mascotaDTO, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<VeterinarioDTO> save(@RequestBody VeterinarioDTO dto){
        return new ResponseEntity<>(service.save(dto),HttpStatus.CREATED);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<VeterinarioDTO> udpate(@PathVariable String id, @RequestBody VeterinarioDTO dto){
        return new ResponseEntity<>(service.update(dto,id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable String id){
        if(service.delete(id)) return new ResponseEntity(HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
