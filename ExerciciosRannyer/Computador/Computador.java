package Computador;

public class Computador {
    private String modelo;
    private Processador processador;

    public Computador(String modelo) {
        this.modelo = modelo;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo do computador: " + modelo);
        if (processador != null) {
            processador.exibirDetalhes();
        } else {
            System.out.println("Processador não instalado.");
        }
    }
}
