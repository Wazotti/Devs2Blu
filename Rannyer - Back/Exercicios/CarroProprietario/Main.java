package CarroProprietario;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("2JZ-GTE 3.0 biturbo", 550);
        Proprietario proprietario = new Proprietario("Brian O'Conner", "123.456.789-00");
        Seguro seguro = new Seguro("RaceSecure Insurance", "RS-987654321", true);
        Carro carro = new Carro("Toyota Supra 1994");

        carro.setMotor(motor);
        carro.setProprietario(proprietario);
        carro.setSeguro(seguro);
        carro.exibirInformacoes();
    }
}