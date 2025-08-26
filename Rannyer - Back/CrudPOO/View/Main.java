package View;

import Controller.RepositorioCrud;
import Controller.RepositorioJogos;
import Model.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepositorioCrud<Jogo> repo = new RepositorioJogos();
        int opcao;

        do {
            System.out.println("\n--- Sistema de Jogos ---");
            System.out.println("\n1 - Cadastrar Jogo");
            System.out.println("2 - Atualizar Jogo");
            System.out.println("3 - Remover Jogo");
            System.out.println("4 - Listar Jogos");
            System.out.println("0 - Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: // Adicionar
                    System.out.print("\nNome: ");
                    String nome = sc.nextLine();
                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble(); sc.nextLine();

                    repo.criar(new Jogo(0, nome, genero, preco));
                    break;

                case 2: // Atualizar
                    System.out.print("\nDigite o ID do jogo a atualizar: ");
                    int idAtualizar = sc.nextInt(); sc.nextLine();
                    Jogo jogoAtual = repo.ler(idAtualizar);
                    if (jogoAtual != null) {
                        System.out.println("\nJogo atual:");
                        jogoAtual.exibirDetalhes();

                        System.out.print("\nNovo nome: ");
                        String novoNome = sc.nextLine();
                        System.out.print("Novo gênero: ");
                        String novoGenero = sc.nextLine();
                        System.out.print("Novo preço: ");
                        double novoPreco = sc.nextDouble(); sc.nextLine();

                        repo.atualizar(new Jogo(idAtualizar, novoNome, novoGenero, novoPreco));
                        System.out.println("\nJogo atualizado!");
                    } else {
                        System.out.println("\nJogo não encontrado.");
                    }
                    break;

                case 3: // Remover
                    System.out.print("\nDigite o ID do jogo a remover: ");
                    int idRemover = sc.nextInt(); sc.nextLine();
                    Jogo jogoRemover = repo.ler(idRemover);
                    if (jogoRemover != null) {
                        System.out.println("\nJogo que será removido: ");
                        jogoRemover.exibirDetalhes();
                        repo.deletar(idRemover);
                        System.out.println("\nJogo removido!");
                    } else {
                        System.out.println("\nJogo não encontrado.");
                    }
                    break;

                case 4: // Listar
                    System.out.println("\nLista de Jogos:");
                    for (Jogo j : repo.listar()) {
                        j.exibirDetalhes();
                    }
                    break;

                case 0: // Sair
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
