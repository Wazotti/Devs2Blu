package CaoDono;

public class Cao {
    private String nome;
    private String raca;
    private Dono dono;

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void exibirDados() {
        System.out.println("Nome do cão: " + nome);
        System.out.println("Raça: " + raca);
        if (dono != null) {
            dono.exibirDados();
        } else {
            System.out.println("Este cão ainda não tem um dono.");
        }
    }
}
