import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {
        // Entrada de dados via JOptionPane
        try {
            // Recebe o valor da transação
            String transacaoInput = JOptionPane.showInputDialog("Informe o valor de transação do imóvel:");
            double valorTransacao = Double.parseDouble(transacaoInput);
            
            // Recebe o valor venal
            String venalInput = JOptionPane.showInputDialog("Informe o valor venal do imóvel:");
            double valorVenal = Double.parseDouble(venalInput);
            
            // Recebe a porcentagem do imposto ITBI
            String impostoInput = JOptionPane.showInputDialog("Informe a porcentagem do imposto ITBI (em %):");
            double percentualITBI = Double.parseDouble(impostoInput);
            
            // Calcula o maior valor entre o valor de transação e o valor venal
            double baseCalculo = Math.max(valorTransacao, valorVenal);
            
            // Calcula o valor do imposto ITBI
            double valorITBI = baseCalculo * (percentualITBI / 100);
            
            // Exibe o resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, "O valor do ITBI a ser pago é: R$ " + String.format("%.2f", valorITBI));
        } catch (NumberFormatException e) {
            // Em caso de erro na conversão de entrada para número
            JOptionPane.showMessageDialog(null, "Erro: por favor, insira valores numéricos válidos.");
        }
    }
}
