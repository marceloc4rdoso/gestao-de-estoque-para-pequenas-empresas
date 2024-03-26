package controller;

import model.Fornecedor;
import model.Movimentacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class MovimentacaoDAO {
    private Connection conn;

    public MovimentacaoDAO() throws SQLException {
        this.conn = ConexaoSQLite.getConexao();
    }


    public ArrayList<Movimentacao> listar() throws SQLException {
        ArrayList<Movimentacao> movimentacoes = new ArrayList<>();
        String sql = "SELECT * FROM movimentacao_estoque;";

        PreparedStatement pps = conn.prepareStatement(sql);

        ResultSet resultSet = pps.executeQuery();

        while (resultSet.next()) {

            Movimentacao movimentacao = new Movimentacao();

            movimentacao.setId(resultSet.getInt("id"));
            movimentacao.setId_produto(resultSet.getInt("id_produto"));
            movimentacao.setId_usuario(resultSet.getInt("id_usuario"));
            LocalDate data = LocalDate.parse(resultSet.getString("data_movimentacao"));
            movimentacao.setDataMovimentacao(data);
            movimentacao.setQuantidade(resultSet.getInt("quantidade"));
            movimentacao.setTipoMovimentacao(resultSet.getString("tipo_movimentacao"));

            movimentacoes.add(movimentacao);
        }
        ;
        return movimentacoes;
    }

    public Movimentacao buscarUm(Integer id) throws SQLException {
        String sql = "SELECT * FROM movimentacao_estoque WHERE id = ?;";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        Fornecedor fornecedor = new Fornecedor();
        Movimentacao movimentacao = new Movimentacao();

        while (resultSet.next()) {
            movimentacao.setId(resultSet.getInt("id"));
            movimentacao.setId_produto(resultSet.getInt("id_produto"));
            movimentacao.setId_usuario(resultSet.getInt("id_usuario"));
            LocalDate data = LocalDate.parse(resultSet.getString("data_movimentacao"));
            movimentacao.setDataMovimentacao(data);
            movimentacao.setQuantidade(resultSet.getInt("quantidade"));
            movimentacao.setTipoMovimentacao(resultSet.getString("tipo_movimentacao"));
        }
        return movimentacao;
    }

    public void inserir(Movimentacao movimentacao) throws SQLException {
        String sql = "INSERT INTO movimentacao_estoque (id_produto, id_usuario, data_movimentacao, quantidade, tipo_movimentacao) VALUES(?, ?, ?, ?, ?);";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, movimentacao.getId_produto());
        preparedStatement.setInt(2, movimentacao.getId_usuario());
        preparedStatement.setString(3, movimentacao.getDataMovimentacao().toString());
        preparedStatement.setInt(4, movimentacao.getQuantidade());
        preparedStatement.setString(5, movimentacao.getTipoMovimentacao());
        preparedStatement.executeUpdate();
    }


    public void deletar(Integer id) throws SQLException {
        String sql = "DELETE FROM movimentacao_estoque WHERE id = ?;";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }



}
