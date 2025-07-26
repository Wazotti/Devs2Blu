package ClassePersonagem;

public class Main {
    public static void main(String[] args) {
        Classe mago = new Classe("Mago", "Controle de Fogo e Luz", "Manipulação da Realidade");
        Arma cajado = new Arma("Cajado Élfico", "Mágica", 75);

        Personagem personagem = new Personagem("Gandalf");
        personagem.setClasse(mago);
        personagem.setArma(cajado);

        personagem.exibirClasse();
        personagem.exibirArma();
        personagem.usarHabilidade();
        personagem.usarHabilidadeEspecial();
        personagem.usarArma();
    }
}

