package Computador;

public class MemoriaRAM {
    private String tipo;
    private int capacidadeGB;

    public MemoriaRAM(String tipo, int capacidadeGB) {
        this.tipo = tipo;
        this.capacidadeGB = capacidadeGB;
    }

    public void exibirDetalhes() {
        System.out.println("Tipo de Memória RAM: " + tipo);
        System.out.println("Capacidade: " + capacidadeGB + " GB");
    }
}
