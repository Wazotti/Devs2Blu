package model;

public abstract class Amigo {
    protected int id;
    protected String nome;
    protected String especie;
    protected String corFavorita;

    public Amigo(int id, String nome, String especie, String corFavorita) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.corFavorita = corFavorita;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }

    public abstract void exibirDetalhes();
}
