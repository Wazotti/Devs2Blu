package CarroProprietario;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("2JZ-GTE 3.0 biturbo", 550);
        Proprietario proprietario = new Proprietario("Brian O'Conner", "123.456.789-00");
        Carro carro = new Carro("Toyota Supra 1994");

        carro.setMotor(motor);
        carro.setProprietario(proprietario);
        carro.exibirInformacoes();
    }
}
