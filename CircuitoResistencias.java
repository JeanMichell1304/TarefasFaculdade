public class CircuitoResistencias {
    // Declaração das variáveis para armazenar as resistências
    private double r1, r2, r3, r4;

    // Construtor da classe que inicializa as quatro resistências
    public CircuitoResistencias(double r1, double r2, double r3, double r4) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
    }

    // Método para calcular a resistência equivalente (soma das resistências em série)
    public double calcularResistenciaEquivalente() {
        return r1 + r2 + r3 + r4;
    }

    // Método para encontrar a maior resistência entre as quatro
    public double maiorResistencia() {
        // Usamos Math.max para comparar duas resistências de cada vez
        return Math.max(Math.max(r1, r2), Math.max(r3, r4));
    }

    // Método para encontrar a menor resistência entre as quatro
    public double menorResistencia() {
        // Usamos Math.min para comparar duas resistências de cada vez
        return Math.min(Math.min(r1, r2), Math.min(r3, r4));
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criamos um objeto CircuitoResistencias com quatro resistências como exemplo
        CircuitoResistencias circuito = new CircuitoResistencias(5.0, 10.0, 3.0, 8.0);

        // Exibimos a resistência equivalente, chamando o método calcularResistenciaEquivalente
        System.out.println("Resistência Equivalente: " + circuito.calcularResistenciaEquivalente());
        
        // Exibimos a maior resistência, chamando o método maiorResistencia
        System.out.println("Maior Resistência: " + circuito.maiorResistencia());
        
        // Exibimos a menor resistência, chamando o método menorResistencia
        System.out.println("Menor Resistência: " + circuito.menorResistencia());
    }
}
