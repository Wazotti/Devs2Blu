package model;

public class Coelho extends Amigo {
    private String corLaco;

    public Coelho(int id, String nome, String corFavorita, String corLaco) {
        super(id, nome, "Coelho", corFavorita);
        this.corLaco = corLaco;
    }

    public String getCorLaco() {
        return corLaco;
    }

    public void setCorLaco(String corLaco) {
        this.corLaco = corLaco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Cor Favorita: " + getCorFavorita());
        System.out.println("Cor do Laço: " + getCorLaco());
    }

    @Override
    public String toString() {
        return "Coelho{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", corFavorita='" + corFavorita + '\'' +
                ", corLaco='" + corLaco + '\'' +
                '}';
    }
}
