package org.example;

public class Jogo {
    private String nome;
    private double preco;
    private int estoque;

    public Jogo(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean vender() {
        if (estoque > 0) {
            estoque--;
            System.out.println(nome + " vendido!");
            return true;
        } else {
            System.out.println("Jogo esgotado!");
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
