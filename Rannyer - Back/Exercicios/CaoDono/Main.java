package CaoDono;

public class Main {
    public static void main(String[] args) {
        Dono dono = new Dono("João da Silva", "(47) 91234-5678");
        Cao cao = new Cao("Bob", "Beagle");
        Veterinario vet = new Veterinario("Dra. Ana Paula", "Clínica Geral", "(47) 99876-5432");

        cao.setDono(dono);
        cao.setVeterinario(vet);
        cao.exibirDados();
    }
}