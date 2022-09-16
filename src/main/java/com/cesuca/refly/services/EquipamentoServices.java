package com.cesuca.refly.services;

import com.cesuca.refly.entities.Colaborador;
import com.cesuca.refly.entities.Equipamento;
import com.cesuca.refly.repositories.ColaboradorRepository;
import com.cesuca.refly.repositories.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EquipamentoServices {

    @Autowired
    private EquipamentoRepository repository;
    @Transactional(readOnly = true)
    public List<Equipamento> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Equipamento addEquipamento(Equipamento novoEquipamento) {
        return repository.saveAndFlush(novoEquipamento);
    }
}
