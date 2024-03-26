package controller;

import controller.ConexaoSQLite;
import model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FornecedorDAO {
    private Connection conn;

    public FornecedorDAO() throws SQLException {
        this.conn = ConexaoSQLite.getConexao();
    }

    public ArrayList<Fornecedor> listar() throws SQLException {
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        String sql = "SELECT * FROM fornecedor;";

        PreparedStatement pps = conn.prepareStatement(sql);

        ResultSet resultSet = pps.executeQuery();

        while (resultSet.next()){

            Fornecedor fornecedor = new Fornecedor();

            fornecedor.setId(resultSet.getInt("id"));
            fornecedor.setNome(resultSet.getString("nome"));
            fornecedor.setId_endereco(resultSet.getInt("id_endereco"));

            fornecedores.add(fornecedor);
        };
        return fornecedores;
    }

    public Fornecedor buscarUm(Integer id) throws SQLException {
        String sql = "SELECT * FROM fornecedor WHERE id = ?;";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        Fornecedor fornecedor = new Fornecedor();

        while (resultSet.next()) {
            fornecedor.setId(resultSet.getInt("id"));
            fornecedor.setNome(resultSet.getString("nome"));
            fornecedor.setId_endereco(resultSet.getInt("id_endereco"));
        }
        return fornecedor;
    }
    
    public void inserir(Fornecedor fornecedor)throws SQLException{
        String sql = "INSERT INTO fornecedor VALUES(null, ?, ?);";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//   preparedStatement.

    }



}
