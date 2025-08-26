package view;

import model.Amigo;
import model.Coelho;
import java.util.List;
import java.util.Scanner;

public class AmigoView {
    private Scanner scanner;

    public AmigoView() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("\n--- Gerenciador de Amigos da Hello Kitty ---\n");
        System.out.println("1. Cadastrar novo amigo");
        System.out.println("2. Listar todos os amigos");
        System.out.println("3. Atualizar dados de um amigo");
        System.out.println("4. Remover um amigo");
        System.out.println("5. Sair\n");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String solicitarNome() {
        System.out.print("Digite o nome do amigo: ");
        scanner.nextLine(); // limpa buffer
        return scanner.nextLine();
    }

    public String solicitarCorFavorita() {
        System.out.print("Digite a cor favorita: ");
        return scanner.nextLine();
    }

    public String solicitarCorLaco() {
        System.out.print("Digite a cor do laço: ");
        return scanner.nextLine();
    }

    public int solicitarId() {
        System.out.print("\nDigite o ID do amigo: ");
        return scanner.nextInt();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirDetalhesAmigo(Amigo amigo) {
        if (amigo != null) {
            amigo.exibirDetalhes();
        } else {
            exibirMensagem("\nAmigo não encontrado.");
        }
    }

    public void exibirListaDeAmigos(List<Coelho> amigos) {
        if (amigos.isEmpty()) {
            exibirMensagem("\nNenhum amigo cadastrado.");
        } else {
            System.out.println("\n--- Lista de Amigos ---");
            amigos.forEach(Amigo::exibirDetalhes);
        }
    }
}
