package CaoDono;

public class Main {
    public static void main(String[] args) {
        Dono dono = new Dono("João da Silva", "(47) 91234-5678");
        Cao cao = new Cao("Bob", "Beagle");

        cao.setDono(dono);
        cao.exibirDados();
    }
}