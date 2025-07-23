package ClassePersonagem;

public class Classe {
    private String nome;
    private String habilidadeBasica;
    private String habilidadeEspecial;

    public Classe(String nome, String habilidadeBasica, String habilidadeEspecial) {
        this.nome = nome;
        this.habilidadeBasica = habilidadeBasica;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getNome() {
        return nome;
    }

    public String getHabilidadeBasica() {
        return habilidadeBasica;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }
}
