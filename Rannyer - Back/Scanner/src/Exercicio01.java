import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    System.out.println("Nota válida: " + nota);
                    break;
                } else {
                    System.out.println("Valor inválido. A nota deve estar entre 0 e 10.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
