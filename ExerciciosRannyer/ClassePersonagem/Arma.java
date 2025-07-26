package ClassePersonagem;

public class Arma {
    private String nome;
    private String tipo;
    private int dano;

    public Arma(String nome, String tipo, int dano) {
        this.nome = nome;
        this.tipo = tipo;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDano() {
        return dano;
    }

    public void exibirDados() {
        System.out.println("Arma: " + nome + " | Tipo: " + tipo + " | Dano: " + dano);
    }
}
