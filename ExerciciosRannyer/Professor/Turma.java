package Professor;

public class Turma {
    private String nomeTurma;
    private int ano;

    public Turma(String nomeTurma, int ano) {
        this.nomeTurma = nomeTurma;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Ano: " + ano);
    }
}
