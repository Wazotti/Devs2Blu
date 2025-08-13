package Model;

public class Jogo extends Entidade {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(int id, String nome, String genero, double preco) {
        super(id);
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n | ID: " + getId());
        System.out.println(" | Nome: " + getNome());
        System.out.println(" | Gênero: " + getGenero());
        System.out.println(" | Preço: R$ " + getPreco());
    }
}
