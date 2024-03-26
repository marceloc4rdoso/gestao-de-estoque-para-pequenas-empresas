package model;

import java.time.LocalDate;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private Double quantidade;
    private Integer id_fornecedor;
    private Integer id_categoria;
    private String marca;
    private LocalDate data_validade;
    private String lote;

    public Produto(Integer id, String nome, String descricao, Double preco, Double quantidade, Integer id_fornecedor, Integer id_categoria, String marca, LocalDate data_validade, String lote) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id_fornecedor = id_fornecedor;
        this.id_categoria = id_categoria;
        this.marca = marca;
        this.data_validade = data_validade;
        this.lote = lote;
    }
    public Produto(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Integer id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getData_validade() {
        return data_validade;
    }

    public void setData_validade(LocalDate data_validade) {
        this.data_validade = data_validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public String toString()  {
        return String.format("| %-4d | %-20s |",
                getId(),
                getNome(),
                getDescricao(),
                getPreco(),
                getQuantidade(),
                getId_fornecedor(),
                getId_categoria(),
                getMarca(),
                getData_validade(),
                getLote());
    }
}

