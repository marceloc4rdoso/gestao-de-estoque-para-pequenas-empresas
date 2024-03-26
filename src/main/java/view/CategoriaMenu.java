package view;

import model.Categoria;
import controller.CategoriaDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CategoriaMenu {
    public static void main(String[] args) throws SQLException {
        int opcao;
        Scanner sc = new Scanner(System.in);
        CategoriaDAO categoriaDAO = new CategoriaDAO();

        do {
            System.out.print("[1]Listar\n[2]Buscar\n[3]inserir\n[4]Atualizar\n[5]Deletar\n[0]Sair\n\tOpcao: ");
            opcao = sc.nextInt();


            if (opcao == 1) {
                ArrayList<Categoria> categorias = categoriaDAO.listar();
                System.out.println("+------------------------+");
                System.out.printf("| %-4s | %-15s |%n", "ID", "NOME");
                System.out.println("+------------------------+");
                for (Categoria categoria : categorias) {
                    System.out.println(categoria.toString());
                }
                System.out.println("+------------------------+");
            } else if (opcao == 2) {
                System.out.print("\u001B[31m Informe o ID da categoria: ");
                int id = sc.nextInt();

                Categoria categoria = categoriaDAO.buscarUm(id);
                System.out.println("\u001B[0m");
                System.out.println("+------------------------+");
                System.out.printf("| %-4s | %-15s |%n", "ID", "NOME");
                System.out.println("+------------------------+");
                System.out.println(categoria);
                System.out.println("+------------------------+");
            } else if (opcao == 3) {

                System.out.print("\u001B[31mInforme o nome da Categoria: ");
                String nome = sc.next();
                categoriaDAO.inserir(new Categoria(nome));

            } else if (opcao == 4) {
                System.out.print("Informe o ID da Categoria: ");
                int id = sc.nextInt();
                System.out.print("Informe o novo nome para Categoria: ");
                String novoNome = sc.next();

                Categoria novaCategoria = new Categoria(id, novoNome);

                categoriaDAO.atualizar(novaCategoria);

            } else if (opcao == 5) {
                System.out.print("Informe o ID: ");
                int id = sc.nextInt();
                categoriaDAO.deletar(id);
            }


        } while (opcao != 0);


    }
}
