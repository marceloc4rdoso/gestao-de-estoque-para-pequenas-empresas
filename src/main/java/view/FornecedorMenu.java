package view;

import model.Fornecedor;
import controller.FornecedorDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class FornecedorMenu {
    public static void main(String[] args) throws SQLException {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("[1]Listar\n[2]Buscar\n[3]inserir\n[4]Atualizar\n[5]Deletar\n[0]Sair\n\tOpcao: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                ArrayList<Fornecedor> fornecedores = fornecedorDAO.listar();

                System.out.println("+------------------------+");
                System.out.printf("| %-4s | %-50s | %-15s |%n", "ID", "NOME","ID ENDEREÇO");
                System.out.println("+------------------------+");
                for (Fornecedor fornecedor: fornecedores) {
                    System.out.println(fornecedor);
                }
                System.out.println("+------------------------+");

            } else if (opcao == 2) {

                System.out.println("Informe o ID:");
                int id = sc.nextInt();

                Fornecedor fornecedor = fornecedorDAO.buscarUm(id);

                System.out.println("+------------------------+");
                System.out.printf("| %-4s | %-50s | %-15s |%n", "ID", "NOME","ID ENDEREÇO");
                System.out.println("+------------------------+");
                System.out.println(fornecedor);
                System.out.println("+------------------------+");

            }


        }while (opcao != 0);








    }
}
