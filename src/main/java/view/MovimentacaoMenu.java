package view;

import controller.MovimentacaoDAO;
import model.Movimentacao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MovimentacaoMenu {
    public static void main(String[] args) throws SQLException {
        MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("[1] Listar\n[2] Buscar\n[3] Inserir\n[4] Atualizar\n[5] Deletar\n[0] Sair\n\tOpcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                ArrayList<Movimentacao> movimentacoes = movimentacaoDAO.listar();

                System.out.println("+----------------------------------------------------------------+");
                System.out.printf("| %-4s | %-15s | %-15s | %-12s | %-15s |%n", "ID", "ID Produto", "ID Usuário", "Data", "Quantidade", "Tipo");
                System.out.println("+----------------------------------------------------------------+");
                for (Movimentacao mov : movimentacoes) {
                    System.out.printf("| %-4d | %-15d | %-15d | %-12s | %-15d | %-10s |%n",
                            mov.getId(), mov.getId_produto(), mov.getId_usuario(),
                            mov.getDataMovimentacao(), mov.getQuantidade(), mov.getTipoMovimentacao());
                }
                System.out.println("+----------------------------------------------------------------+");

            } else if (opcao == 2) {
                System.out.println("Informe o ID:");
                int id = sc.nextInt();

                Movimentacao movimentacao = movimentacaoDAO.buscarUm(id);

                System.out.println("+----------------------------------------------------------------+");
                System.out.printf("| %-4s | %-15s | %-15s | %-12s | %-15s |%n", "ID", "ID Produto", "ID Usuário", "Data", "Quantidade", "Tipo");
                System.out.println("+----------------------------------------------------------------+");
                System.out.printf("| %-4d | %-15d | %-15d | %-12s | %-15d | %-10s |%n",
                        movimentacao.getId(), movimentacao.getId_produto(), movimentacao.getId_usuario(),
                        movimentacao.getDataMovimentacao(), movimentacao.getQuantidade(), movimentacao.getTipoMovimentacao());
                System.out.println("+----------------------------------------------------------------+");

            } else if (opcao == 3) {
                Movimentacao novaMovimentacao = new Movimentacao();
                System.out.println("ID do Produto:");
                novaMovimentacao.setId_produto(sc.nextInt());

                System.out.println("ID do Usuário:");
                novaMovimentacao.setId_usuario(sc.nextInt());

                System.out.println("Data da Movimentação (YYYY-MM-DD):");
                sc.nextLine(); // Consumir nova linha
                String dataStr = sc.nextLine();
                LocalDate data = LocalDate.parse(dataStr);
                novaMovimentacao.setDataMovimentacao(data);

                System.out.println("Quantidade:");
                novaMovimentacao.setQuantidade(sc.nextInt());
                sc.nextLine(); // Consumir nova linha

                System.out.println("Tipo de Movimentação (entrada/saida):");
                novaMovimentacao.setTipoMovimentacao(sc.nextLine());

                movimentacaoDAO.inserir(novaMovimentacao);
                System.out.println("Movimentação inserida com sucesso.");
                movimentacaoDAO.inserir(novaMovimentacao);
            } else if (opcao == 4) {
                // Implementar a lógica de atualização
            } else if (opcao == 5) {
                System.out.println("Informe o ID da Movimentação que deseja remover:");
                int idParaRemover = sc.nextInt();

                movimentacaoDAO.deletar(idParaRemover);
                System.out.println("Movimentação removida com sucesso.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
