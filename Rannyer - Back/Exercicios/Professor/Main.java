package Professor;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("História", 80);
        Turma turma = new Turma("8ºA", 2025);
        Professor professor = new Professor("Maria Souza");

        professor.setDisciplina(disciplina);
        professor.setTurma(turma);
        professor.exibirDados();
    }
}