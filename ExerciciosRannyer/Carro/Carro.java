package Carro;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void exibirDetalhes() {
        System.out.println("Modelo do Carro: " + modelo);
        if (motor != null) {
            motor.exibirDetalhes();
        } else {
            System.out.println("Este carro ainda não tem um motor.");
        }
    }
}
