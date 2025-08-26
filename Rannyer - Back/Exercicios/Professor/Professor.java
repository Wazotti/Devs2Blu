package Professor;

public class Professor {
    private String nome;
    private Disciplina disciplina;
    private Turma turma;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void exibirDados() {
        System.out.println("Professor: " + nome);

        if (disciplina != null) {
            disciplina.exibirDados();
        } else {
            System.out.println("Nenhuma disciplina atribuída.");
        }

        if (turma != null) {
            turma.exibirDados();
        } else {
            System.out.println("Nenhuma turma atribuída.");
        }
    }
}