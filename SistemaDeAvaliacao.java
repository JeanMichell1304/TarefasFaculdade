import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

    public static void main(String[] args) {
        try {
            // Recebe as notas das duas provas e do trabalho
            String prova1Input = JOptionPane.showInputDialog("Informe a nota da primeira prova:");
            double prova1 = Double.parseDouble(prova1Input);
            
            String prova2Input = JOptionPane.showInputDialog("Informe a nota da segunda prova:");
            double prova2 = Double.parseDouble(prova2Input);
            
            String trabalhoInput = JOptionPane.showInputDialog("Informe a nota do trabalho:");
            double trabalho = Double.parseDouble(trabalhoInput);
            
            // Calcula a média
            double media = (prova1 + prova2 + trabalho) / 3;
            
            // Verifica se o aluno está aprovado ou reprovado
            String status = media >= 6 ? "Aprovado" : "Reprovado";
            
            // Exibe o resultado
            JOptionPane.showMessageDialog(null, "Média: " + String.format("%.2f", media) + "\nStatus: " + status);
        } catch (NumberFormatException e) {
            // Em caso de erro na conversão de entrada para número
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira valores numéricos válidos.");
        }
    }
}
