package model;

import java.time.LocalDate;

public class Movimentacao {
    private Integer id;
    private  Integer id_produto;
    private Integer id_usuario;
    private LocalDate dataMovimentacao;
    private Integer quantidade;
    private String tipoMovimentacao;

    public Movimentacao(Integer id, Integer id_produto, Integer id_usuario, LocalDate dataMovimentacao, Integer quantidade, String tipoMovimentacao) {
        this.id = id;
        this.id_produto = id_produto;
        this.id_usuario = id_usuario;
        this.dataMovimentacao = dataMovimentacao;
        this.quantidade = quantidade;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Movimentacao(){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    @Override
    public String toString() {
        return String.format("| %-4d | %-4d | %-4d | %-15s | %-4d | %-15s |",getId(), getId_produto(),getId_usuario(),getDataMovimentacao(),getQuantidade(),getTipoMovimentacao());

    }
}
