import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		
		// Entrada de dados
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		soma = (numero1 + numero2);
		
		// Saída de dados
		System.out.println("O resultado da soma é: " + soma);
		
	}

}
