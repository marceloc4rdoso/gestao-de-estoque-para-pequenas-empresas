package controller;

import controller.ConexaoSQLite;
import model.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDAO {

    private Connection conn;

    public CategoriaDAO() throws SQLException {
        conn = ConexaoSQLite.getConexao();
    }

    public ArrayList<Categoria> listar() throws SQLException {

        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria;";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Categoria categoria = new Categoria();
            categoria.setId(resultSet.getInt("id"));
            categoria.setNome(resultSet.getString("nome"));

            categorias.add(categoria);
        }

        return categorias;
    }

    public Categoria buscarUm(Integer id) throws SQLException {
        String sql = "SELECT * FROM categoria WHERE id = ?;";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        Categoria categoria = new Categoria();

        while (resultSet.next()) {
            categoria.setId(resultSet.getInt("id"));
            categoria.setNome(resultSet.getString("nome"));
        }
        return categoria;
    }

    public void inserir(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO categoria VALUES (null, ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1, categoria.getNome());
        preparedStatement.executeUpdate();
    }

    public void deletar(Integer id) throws SQLException {
        String sql = "DELETE FROM categoria WHERE id = ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public void atualizar(Categoria categoria)throws SQLException{
        String sql = "UPDATE categoria SET nome = ? WHERE id = ?;";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, categoria.getNome());
        preparedStatement.setInt(2, categoria.getId());

        preparedStatement.executeUpdate();
    }

}
