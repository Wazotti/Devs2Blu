package Carro;

public class Carro {
    private String modelo;
    private Motor motor;
    private Oficina oficina;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo do Carro: " + modelo);

        if (motor != null) {
            motor.exibirDetalhes();
        } else {
            System.out.println("Este carro ainda não tem um motor.");
        }

        if (oficina != null) {
            oficina.exibirDetalhes();
        } else {
            System.out.println("Este carro ainda não está vinculado a uma oficina.");
        }
    }
}
