package org.example;

public class Notificacao {
    public void enviarEmailConfirmacao(Cliente cliente, Jogo jogo) {
        System.out.println("Email de confirmação enviado para " + cliente.getEmail() +
                " sobre a compra do jogo " + jogo.getNome());
    }
}
