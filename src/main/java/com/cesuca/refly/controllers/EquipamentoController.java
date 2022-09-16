package com.cesuca.refly.controllers;

import com.cesuca.refly.entities.Colaborador;
import com.cesuca.refly.entities.Equipamento;
import com.cesuca.refly.services.EquipamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/equipamentos")
public class EquipamentoController {

    @Autowired
    private EquipamentoServices service;

    @GetMapping
    public List<Equipamento> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Equipamento createEquipamento(@RequestBody Equipamento novoEquipamento) {
        return service.addEquipamento(novoEquipamento);
    }

}
