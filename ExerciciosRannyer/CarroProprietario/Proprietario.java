package CarroProprietario;

public class Proprietario {
    private String nome;
    private String cpf;

    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Proprietário: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
