package Carro;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", 450);
        Carro carro = new Carro("Mustang");

        carro.setMotor(motor);
        carro.exibirDetalhes();
    }
}
