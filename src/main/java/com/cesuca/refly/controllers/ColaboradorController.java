package com.cesuca.refly.controllers;

import com.cesuca.refly.entities.Colaborador;
import com.cesuca.refly.services.ColaboradorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorServices service;

    @GetMapping
    public List<Colaborador> findAll() {
        return service.findAll();
    }
}
