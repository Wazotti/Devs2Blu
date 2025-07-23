package ClassePersonagem;

public class Main {
    public static void main(String[] args) {
        Classe mago = new Classe("Mago", "Controle de Fogo e Luz", "Manipulação da Realidade");
        Personagem personagem = new Personagem("Gandalf");

        personagem.setClasse(mago);
        personagem.exibirClasse();
        personagem.usarHabilidade();
        personagem.usarHabilidadeEspecial();
    }
}
