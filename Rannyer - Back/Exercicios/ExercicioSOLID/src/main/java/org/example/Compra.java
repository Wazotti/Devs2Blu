package org.example;

public class Compra {
    private Pagamento pagamento;
    private Notificacao notificacao;

    public Compra(Pagamento pagamento, Notificacao notificacao) {
        this.pagamento = pagamento;
        this.notificacao = notificacao;
    }

    public void realizarCompra(Cliente cliente, Jogo jogo) {
        if (jogo.vender()) {
            pagamento.processarPagamento(cliente, jogo.getPreco());
            notificacao.enviarEmailConfirmacao(cliente, jogo);
        }
    }
}
