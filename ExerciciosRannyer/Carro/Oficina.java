package Carro;

public class Oficina {
    private String nome;
    private String telefone;

    public Oficina(String s, String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do Proprietário: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}