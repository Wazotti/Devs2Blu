package CaoDono;

public class Dono {
    private String nome;
    private String telefone;

    public Dono(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Nome do dono: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
