package ClassePersonagem;

public class Personagem {
    private String nome;
    private Classe classe;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
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
    public void exibirClasse () {
        if (classe != null) {
            System.out.println("Classe do personagem: " + classe.getNome());
        } else {
            System.out.println("Classe não definida.");
        }
    }
}