package com.clinicaveterinariatfgapi.web.controller;

import com.clinicaveterinariatfgapi.domain.dto.CitaDTO;
import com.clinicaveterinariatfgapi.domain.service.CitaDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaDTOService service;

    @GetMapping("/todos")
    public ResponseEntity<List<CitaDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}
