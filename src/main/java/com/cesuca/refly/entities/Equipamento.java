package com.cesuca.refly.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="equipamento")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long colaboradorId;
    private Long statusId;
    private Long tipoId;
    private Long marcaId;
    private String observacao;
    private Date dataCadastro;
    private Date dataConclusao;

    public Equipamento() {}

    public Equipamento(Long id, Long colaboradorId, Long statusId, Long tipoId, Long marcaId, String observacao, Date dataCadastro, Date dataConclusao) {
        this.id = id;
        this.colaboradorId = colaboradorId;
        this.statusId = statusId;
        this.tipoId = tipoId;
        this.marcaId = marcaId;
        this.observacao = observacao;
        this.dataCadastro = dataCadastro;
        this.dataConclusao = dataConclusao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(Long colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getTipoId() {
        return tipoId;
    }

    public void setTipoId(Long tipoId) {
        this.tipoId = tipoId;
    }

    public Long getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Long marcaId) {
        this.marcaId = marcaId;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

}
