package Penitenciaria;

public class Presidiario {
    private String nome;
    private int idade;
    private String numeroDeIndentificacao;
    private String crime;
    private int setenca;

    public Presidiario(String nome, int idade, String numeroDeIndentificacao, String crime, int setenca) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeIndentificacao = numeroDeIndentificacao;
        this.crime = crime;
        this.setenca = setenca;
    }
    public void cumprirAnoSetenca() {
        if (setenca > 0) setenca--;
    }
    public boolean estaCumprindoSetenca() {
        return  setenca > 0;
    }
}