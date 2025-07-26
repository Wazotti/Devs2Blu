package Carro;

public class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void exibirDetalhes() {
        System.out.println("Tipo do Motor: " + tipo);
        System.out.println("Potência: " + potencia + " cv");
    }
}
