package com.cesuca.refly.dtos;

import com.cesuca.refly.entities.Colaborador;

public class ColaboradorDTO {

    private Long id;
    private String name;

    public ColaboradorDTO() {}

    public ColaboradorDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ColaboradorDTO(Colaborador colaborador) {
        id = colaborador.getId();
        name = colaborador.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
