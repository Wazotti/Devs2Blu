package CaoDono;

public class Veterinario {
    private String nome;
    private String especialidade;
    private String telefone;

    public Veterinario(String nome, String especialidade, String telefone) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Veterinário: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Telefone do veterinário: " + telefone);
    }
}