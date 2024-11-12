import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o valor do produto
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        // Recebe a porcentagem de desconto
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        // Calcula o valor do desconto
        double valorDesconto = valorProduto * (porcentagemDesconto / 100);

        // Calcula o preço final do produto após aplicar o desconto
        double precoFinal = valorProduto - valorDesconto;

        // Exibe o valor do desconto e o preço final
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

        // Fecha o Scanner
        scanner.close();
    }
}