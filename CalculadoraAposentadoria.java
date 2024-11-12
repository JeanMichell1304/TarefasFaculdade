import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        try {
            // Entrada de dados via JOptionPane
            String idadeInput = JOptionPane.showInputDialog("Informe sua idade:");
            int idade = Integer.parseInt(idadeInput);
            
            String sexoInput = JOptionPane.showInputDialog("Informe seu sexo (M/F):");
            char sexo = sexoInput.charAt(0);
            
            String anosContribuicaoInput = JOptionPane.showInputDialog("Informe quantos anos de contribuição você tem:");
            int anosContribuicao = Integer.parseInt(anosContribuicaoInput);
            
            // Variável para armazenar a mensagem de saída
            String mensagem = "";

            if (sexo == 'M' || sexo == 'm') {
                // Homens: Aposentadoria por idade aos 65 anos ou por tempo de contribuição com 35 anos
                if (idade >= 65 && anosContribuicao >= 35) {
                    mensagem = "Você já pode se aposentar por ambos os critérios!";
                } else if (idade >= 65) {
                    mensagem = "Você pode se aposentar por idade!";
                } else if (anosContribuicao >= 35) {
                    mensagem = "Você pode se aposentar por tempo de contribuição!";
                } else {
                    int anosFaltandoIdade = 65 - idade;
                    int anosFaltandoContribuicao = 35 - anosContribuicao;
                    mensagem = "Faltam " + anosFaltandoIdade + " anos para se aposentar por idade\n" +
                               "Faltam " + anosFaltandoContribuicao + " anos para se aposentar por tempo de contribuição";
                }
            } else if (sexo == 'F' || sexo == 'f') {
                // Mulheres: Aposentadoria por idade aos 60 anos ou por tempo de contribuição com 30 anos
                if (idade >= 60 && anosContribuicao >= 30) {
                    mensagem = "Você já pode se aposentar por ambos os critérios!";
                } else if (idade >= 60) {
                    mensagem = "Você pode se aposentar por idade!";
                } else if (anosContribuicao >= 30) {
                    mensagem = "Você pode se aposentar por tempo de contribuição!";
                } else {
                    int anosFaltandoIdade = 60 - idade;
                    int anosFaltandoContribuicao = 30 - anosContribuicao;
                    mensagem = "Faltam " + anosFaltandoIdade + " anos para se aposentar por idade\n" +
                               "Faltam " + anosFaltandoContribuicao + " anos para se aposentar por tempo de contribuição";
                }
            } else {
                mensagem = "Sexo inválido. Informe M para masculino ou F para feminino.";
            }

            // Exibe a mensagem com as informações
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (NumberFormatException e) {
            // Exceção para casos em que a entrada não é um número válido
            JOptionPane.showMessageDialog(null, "Erro: por favor, insira valores numéricos válidos.");
        }
    }
}
