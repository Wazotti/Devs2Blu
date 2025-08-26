package Carro;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("RB26DETT", 280);
        Carro carro = new Carro("Nissan Skyline GT-R R34");
        Oficina oficina = new Oficina("Toretto's Garage", "Los Angeles, CA", "Performance e Tuning");

        carro.setMotor(motor);
        carro.setOficina(oficina);
        carro.exibirDetalhes();
    }
}
