package org.example;

import java.util.Scanner;

public class LojaEstranha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Jogo jogo1 = new Jogo("Super Mario", 150, 5);
        Jogo jogo2 = new Jogo("Zelda", 200, 3);
        Cliente cliente = new Cliente("Lucas", "lucas@email.com");

        // Injeção de dependências (DIP)
        Pagamento pagamento = new PagamentoCartao();
        Notificacao notificacao = new Notificacao();
        Compra compra = new Compra(pagamento, notificacao);

        int opcao = 0;

        while(opcao != 3) {
            System.out.println("\n===== MENU ESTRANHO =====");
            System.out.println("1 - Comprar Super Mario");
            System.out.println("2 - Comprar Zelda");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            if(opcao == 1) {
                compra.realizarCompra(cliente, jogo1);
            } else if(opcao == 2) {
                compra.realizarCompra(cliente, jogo2);
            } else if(opcao == 3) {
                System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }

        scan.close();
    }
}
