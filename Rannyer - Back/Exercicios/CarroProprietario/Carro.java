package CarroProprietario;

public class Carro {
    private String modelo;
    private Motor motor;
    private Proprietario proprietario;
    private Seguro seguro;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo do carro: " + modelo);

        if (motor != null) {
            motor.exibirDados();
        } else {
            System.out.println("Sem motor definido.");
        }

        if (proprietario != null) {
            proprietario.exibirDados();
        } else {
            System.out.println("Sem proprietário definido.");
        }

        if (seguro != null) {
            seguro.exibirDados();
        } else {
            System.out.println("Sem seguro cadastrado.");
        }
    }
}