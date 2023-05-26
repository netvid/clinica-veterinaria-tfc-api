package com.clinicaveterinariatfgapi.web.controller;

import com.clinicaveterinariatfgapi.domain.dto.MascotaDTO;
import com.clinicaveterinariatfgapi.domain.service.MascotaDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaDTOService service;

    @GetMapping("/todos")
    public ResponseEntity<List<MascotaDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);

    }
}
