import java.util.Scanner;
public class Exercicio09 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		
		// Entrada de dados
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		numero3 = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println(numero1 + " é o maior número!");
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println(numero2 + " é o maior número!");
		} else {
			System.out.println(numero3 + " é o maior número!");
		}
	}

}
