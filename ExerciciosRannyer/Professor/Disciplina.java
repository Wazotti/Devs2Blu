package Professor;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
    }
}

