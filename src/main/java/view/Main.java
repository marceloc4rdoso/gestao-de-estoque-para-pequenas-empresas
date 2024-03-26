package view;

import controller.CategoriaDAO;
import controller.FornecedorDAO;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        //Objetos DAO
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();

        int opcao;

        do {

            System.out.print("[1]Produto\n[2]Categoria\n[3]Fornecedor\n[4]Movimentação\n[0]Sair\n\tOpcao: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                ProdutoMenu.main(args);
            }
            if (opcao == 2) {
                CategoriaMenu.main(args);
            }
            if (opcao == 3) {
                FornecedorMenu.main(args);
            }
            if (opcao == 4) {
                MovimentacaoMenu.main(args);
            }



        }while (opcao != 0);














//
//
//
//        CategoriaDAO categoriaDAO = new CategoriaDAO();
//        ArrayList<Categoria> categorias = categoriaDAO.listar();
//
//        System.out.println("+------------------------+");
//        System.out.printf("| %-4s | %-15s |%n","ID","NOME");
//        System.out.println("+------------------------+");
//        for (Categoria categoria:categorias) {
//            System.out.println(categoria.toString());
//        }
//        System.out.println("+------------------------+");
//
//
//        FornecedorDAO fornecedorDAO = new FornecedorDAO();
//
//        ArrayList<Fornecedor> fornecedores = fornecedorDAO.listar();
//
//        System.out.println("+-----------------------------------------------------------------------------+");
//        System.out.printf("| %-4s | %-50s | %-15s |%n","ID","NOME","ID ENDERECO");
//        System.out.println("+-----------------------------------------------------------------------------+");
//        for (Fornecedor fornecedor: fornecedores) {
//            System.out.println(fornecedor);
//        }
//        System.out.println("+-----------------------------------------------------------------------------+");
//
//







//        System.out.println(categoriaDAO.buscarUm(5));


//        Categoria categoria = new Categoria();
//        categoria.setNome("Jogos");
//
//        categoriaDAO.inserir(categoria);

//        categoriaDAO.deletar(11);

//        Categoria categoria = new Categoria();
//        categoria.setId(12);
//        categoria.setNome("Eletro Domestico");
//
//
//        categoriaDAO.atualizar(categoria);

    }
}
