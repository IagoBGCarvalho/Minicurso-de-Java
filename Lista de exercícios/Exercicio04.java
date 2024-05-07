import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double numero = 0;
		double resultado = 1;
		
		// Entrada de dados
		System.out.print("Digite um número: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		for (double i = numero ; i > 0 ; i--) {
			resultado *= i;
		}
		
		// Saída de dados
		System.out.println(numero + "! = " + resultado);
	}

}
