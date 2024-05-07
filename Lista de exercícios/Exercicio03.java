import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		// Entrada de dados
		
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		
		if (numero % 2 == 0) {
			System.out.println("É par!");
		} else {
			System.out.println("É Ímpar!");
		}
		
		
	}

}
