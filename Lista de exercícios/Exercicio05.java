import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " é maior do que " + numero2 + "!");
		} else {
			System.out.println(numero2 + " é maior do que " + numero1 + "!");
		}
	}

}
