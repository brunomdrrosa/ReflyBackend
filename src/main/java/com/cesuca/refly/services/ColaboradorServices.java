package com.cesuca.refly.services;

import com.cesuca.refly.entities.Colaborador;
import com.cesuca.refly.repositories.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ColaboradorServices {

    @Autowired
    private ColaboradorRepository repository;
    @Transactional(readOnly = true)
    public List<Colaborador> findAll() {
        return repository.findAll();
    }
}
