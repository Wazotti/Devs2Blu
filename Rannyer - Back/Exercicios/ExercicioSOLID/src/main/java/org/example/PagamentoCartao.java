package org.example;

public class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(Cliente cliente, double valor) {
        System.out.println("Pagamento de R$" + valor + " processado no cartão para " + cliente.getNome());
    }
}
