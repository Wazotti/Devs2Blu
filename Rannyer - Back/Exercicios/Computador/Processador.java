package Computador;

public class Processador {

    private String marca;
    private double velocidadeGHz;

    public Processador(String marca, double velocidadeGHz) {
        this.marca = marca;
        this.velocidadeGHz = velocidadeGHz;
    }

    public void exibirDetalhes() {
        System.out.println("Marca do processador: " + marca);
        System.out.println("Velocidade: " + velocidadeGHz + " GHz");
    }
}