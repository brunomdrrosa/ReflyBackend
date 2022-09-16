package com.cesuca.refly.entities;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="equipamentoStatus")
public class EquipamentoStatus implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="equipamento_id")
    private Equipamento equipamento;
    private String descricao;

    public EquipamentoStatus() {}

    public EquipamentoStatus(Long id, Equipamento equipamento, String descricao) {
        this.id = id;
        this.equipamento = equipamento;
        this.descricao = descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
