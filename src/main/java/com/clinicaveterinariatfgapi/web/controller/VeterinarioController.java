package com.clinicaveterinariatfgapi.web.controller;

import com.clinicaveterinariatfgapi.domain.dto.VeterinarioDTO;
import com.clinicaveterinariatfgapi.domain.service.VeterinarioDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioDTOService service;

    @GetMapping("/todos")
    public ResponseEntity<List<VeterinarioDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
