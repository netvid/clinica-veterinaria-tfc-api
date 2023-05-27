package com.clinica_veterinaria_tfg_api.web.controller;

import com.clinica_veterinaria_tfg_api.domain.dto.ClienteDTO;
import com.clinica_veterinaria_tfg_api.domain.service.ClienteDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClienteController {


    @Autowired
    private ClienteDTOService service;

    @GetMapping( "/all")
    public ResponseEntity<List<ClienteDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> getById(@PathVariable String id){
        return service.getById(id).map(clienteDTO -> {
            return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<ClienteDTO> save(@RequestBody ClienteDTO dto){
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }


    @PutMapping("/{id}/update")
    public ResponseEntity<ClienteDTO> update(@PathVariable String id, @RequestBody ClienteDTO dto){
        return new ResponseEntity<>(service.update(dto,id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable String id){
        if(service.delete(id)) return new ResponseEntity(HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


}
