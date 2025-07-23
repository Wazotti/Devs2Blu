package Professor;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("História", 80);
        Professor professor = new Professor("Maria Souza");

        professor.setDisciplina(disciplina);
        professor.exibirDados();
    }
}