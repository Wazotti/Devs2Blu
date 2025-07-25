package Computador;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", 3.5);
        MemoriaRAM memoriaRAM = new MemoriaRAM("DDR4", 16);
        Computador computador = new Computador("Dell XPS");

        computador.setProcessador(processador);
        computador.setMemoriaRAM(memoriaRAM);
        computador.exibirDetalhes();
    }
}