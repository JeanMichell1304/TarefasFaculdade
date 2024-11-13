import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {
        // Definindo o login e senha corretos
        String loginCorreto = "java8";
        String senhaCorreta = "java8";

        // Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Número de tentativas
        int tentativas = 3;

        // Loop para permitir até 3 tentativas
        while (tentativas > 0) {
            // Solicita o login
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();

            // Solicita a senha
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            // Verifica se o login e a senha estão corretos
            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Login ou senha incorretos. Você tem " + tentativas + " tentativa(s) restante(s).");
                } else {
                    System.out.println("Número de tentativas excedido. Acesso negado.");
                }
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
