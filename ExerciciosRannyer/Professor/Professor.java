package Professor;

public class Professor {
    private String nome;
    private Disciplina disciplina;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("Professor: " + nome);
        if (disciplina != null) {
            disciplina.exibirDados();
        } else {
            System.out.println("Nenhuma disciplina atribuída.");
        }
    }
}
