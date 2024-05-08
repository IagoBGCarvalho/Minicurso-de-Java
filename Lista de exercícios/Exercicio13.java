import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		// Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        
        // Entrada de dados

        System.out.print("Digite o valor principal: ");
        double principal = leitor.nextDouble();

        System.out.print("Digite a taxa de juros (em porcentagem): ");
        double taxaJuros = leitor.nextDouble();

        System.out.print("Digite o período (em anos): ");
        double periodo = leitor.nextDouble();

        double montante = calcularMontante(principal, taxaJuros, periodo);
        
        leitor.close();
        
        // Saída de dados

        System.out.println("O montante final após " + periodo + " anos será: R$" + montante);

    }

    public static double calcularMontante(double x, double y, double z) {
        z = z / 100;
        
        double montante = x * (1 + y * z);
        
        return montante;
    }

}
