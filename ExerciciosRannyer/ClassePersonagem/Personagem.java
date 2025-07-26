package ClassePersonagem;

public class Personagem {
    private String nome;
    private Classe classe;
    private Arma arma;  // NOVO atributo

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void usarHabilidade() {
        if (classe != null) {
            System.out.println(nome + " usou a habilidade básica: " + classe.getHabilidadeBasica());
        } else {
            System.out.println(nome + " ainda não possui uma classe definida.");
        }
    }

    public void usarHabilidadeEspecial() {
        if (classe != null) {
            System.out.println(nome + " usou a habilidade especial: " + classe.getHabilidadeEspecial());
        } else {
            System.out.println(nome + " ainda não possui uma classe definida.");
        }
    }

    public void exibirClasse() {
        if (classe != null) {
            System.out.println("Classe do personagem: " + classe.getNome());
        } else {
            System.out.println("Classe não definida.");
        }
    }

    public void exibirArma() {
        if (arma != null) {
            arma.exibirDados();
        } else {
            System.out.println(nome + " não possui uma arma equipada.");
        }
    }

    public void usarArma() {
        if (arma != null) {
            System.out.println(nome + " atacou com " + arma.getNome() + " causando " + arma.getDano() + " de dano!");
        } else {
            System.out.println(nome + " está desarmado.");
        }
    }
}