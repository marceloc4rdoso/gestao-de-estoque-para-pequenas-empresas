package view;

import controller.ProdutoDAO;
import model.Produto;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class ProdutoMenu {
    public static void main(String[] args)throws SQLException {





        ProdutoDAO produtoDAO = new ProdutoDAO();
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.print("[1]Listar\n[2]Buscar\n[3]Inserir\n[4]Atualizar\n[5]Remover\n[0]Sair\n\tOpcao: ");
        opcao = sc.nextInt();
        if (opcao == 1) {
            ArrayList<Produto> categorias = ProdutoDAO.listar();
            System.out.println("+-----------------------------+");
            System.out.printf("| %-4s | %-20s |%n", "ID", "NOME");
            System.out.println("+-----------------------------+");
            for (Produto categoria : categorias) {
                System.out.println(categoria.toString());
            }
            System.out.println("+-----------------------------+");
        } else if (opcao == 2) {
            System.out.print("\u001B[31m Informe o ID do Produto: ");
            int id = sc.nextInt();
            Produto produto = ProdutoDAO.bucarUm(id);
            System.out.println("\u001B[0m");
            System.out.println("+-----------------------------+");
            System.out.printf("| %-4s | %-20s |%n", "ID", "NOME");
            System.out.println("+-----------------------------+");
            System.out.println(produto);
            System.out.println("+-----------------------------+");

        } else if (opcao == 3) {
            System.out.print("\u001B[31m Informe o nome para Produto: ");
            String nome = sc.next();
            System.out.print("\u001B[31m Informe a descrição: ");
            String descricao = sc.next();
            System.out.print("\u001B[31m Informe o preço: ");
            double preco = sc.nextDouble();
            System.out.print("\u001B[31m Informe a quantidade: ");
            double quantidade = sc.nextDouble();
            System.out.print("\u001B[31m Informe o ID do fornecedor: ");
            int id_fornecedor = sc.nextInt();
            System.out.print("\u001B[31m Informe a marca do produto: ");
            String marca = sc.next();
            System.out.print("\u001B[31m Informe a data de validade (yyyy-mm-dd): ");
            String data = sc.next();
            LocalDate data_validade = LocalDate.parse(data);
            System.out.print("\u001B[31m Informe o lote do produto: ");
            String lote = sc.next();
            System.out.print("\u001B[31m Informe o ID da categoria: ");
            int id_categoria = sc.nextInt();

            System.out.println("\u001B[0m");

            Produto novoProduto = new Produto(null, nome, descricao, preco, quantidade, id_fornecedor, id_categoria, marca, data_validade, lote);
            ProdutoDAO.incluir(novoProduto);
        } else if (opcao == 4) {
            System.out.print("\u001B[31m Informe o ID da Produto: ");
            int id = sc.nextInt();
            System.out.print("\u001B[31m Informe o nome para Produto: ");
            String nome = sc.next();
            System.out.print("\u001B[31m Informe a descrição: ");
            String descricao = sc.next();
            System.out.print("\u001B[31m Informe o preço: ");
            double preco = sc.nextDouble();
            System.out.print("\u001B[31m Informe a quantidade: ");
            double quantidade = sc.nextDouble();
            System.out.print("\u001B[31m Informe o ID do fornecedor: ");
            int id_fornecedor = sc.nextInt();
            System.out.print("\u001B[31m Informe a marca do produto: ");
            String marca = sc.next();
            System.out.print("\u001B[31m Informe a data de validade (yyyy-mm-dd): ");
            String data = sc.next();
            LocalDate data_validade = LocalDate.parse(data);
            System.out.print("\u001B[31m Informe o lote do produto: ");
            String lote = sc.next();
            System.out.print("\u001B[31m Informe o ID da categoria: ");
            int id_categoria = sc.nextInt();

            System.out.println("\u001B[0m");

            Produto novoProduto = new Produto(id, nome, descricao, preco, quantidade, id_fornecedor, id_categoria, marca, data_validade, lote);
            ProdutoDAO.atualizar(novoProduto);

        } else if (opcao == 5) {
            System.out.print("\u001B[31m Informe o ID da Produto: ");
            int id = sc.nextInt();
            System.out.println("\u001B[0m");
            ProdutoDAO.remover(id);
        }

    }


    public void lerdados(){
    }
}


