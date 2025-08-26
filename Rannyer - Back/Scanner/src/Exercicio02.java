import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.print("Digite o seu nome de usuário: ");
        usuario = scanner.nextLine();

        while (true) {
            System.out.print("Digite a sua senha de usuário: ");
            senha = scanner.nextLine();

            if (!usuario.equals(senha)) {
                System.out.println("Cadastro realizado com sucesso!");
                System.out.println("Seu nome de usuário é: " + usuario);
                System.out.println("Sua senha de usuário é: " + senha);
                break;
            }else {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        }
        scanner.close();
    }
}
