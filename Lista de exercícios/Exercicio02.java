import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		
		int media = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		numero3 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		media = ((numero1 + numero2 + numero3) / 3);
		
		// Saída de dados
		System.out.println("A média dos trẽs números é: " + media);
	}

}
