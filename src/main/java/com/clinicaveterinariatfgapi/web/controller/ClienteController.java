package com.clinicaveterinariatfgapi.web.controller;

import com.clinicaveterinariatfgapi.domain.dto.ClienteDTO;
import com.clinicaveterinariatfgapi.domain.service.ClienteDTOService;
import com.clinicaveterinariatfgapi.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @Autowired
    private ClienteDTOService service;

    @GetMapping( "/todos")
    public ResponseEntity<List<ClienteDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }


}
