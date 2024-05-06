import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		// Decclaração de variáveis e entrada de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int numero2 = leitor.nextInt();
		
		int multi = multiplicacao(numero1, numero2);
		
		leitor.close();
		
		// Saida de dados
		
		System.out.println("O resultado da multiplição é: " + multi);
		
	}
	
	public static int multiplicacao(int x, int y) {
		return x * y;
	}

}
