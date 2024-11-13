import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário um número para gerar a tabuada
        System.out.print("Digite um número para gerar sua tabuada: ");
        int numero = scanner.nextInt();
        
        // Gerando a tabuada do número de 1 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
