package model;

public class Fornecedor {
    private Integer id;
    private String nome;
    private Integer id_endereco;

    public Fornecedor(){}

    public Fornecedor(Integer id, String nome, Integer id_endereco) {
        this.id = id;
        this.nome = nome;
        this.id_endereco = id_endereco;
    }

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

    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    @Override
    public String toString() {
        return String.format("| %-4d | %-50s | %-15d |",getId(), getNome(),getId_endereco());
    }
}
