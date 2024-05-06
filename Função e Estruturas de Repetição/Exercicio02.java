import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		// Declaracao de variaveis e entrada de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = leitor.nextInt();
		
		int multiplo = multiplode2(numero);
		
		leitor.close();
		
		// Saida de dados
		
		if (multiplo == 0) {
			System.out.println("É múltiplo de 2!");
		} else {
			System.out.print("Não é múltiplo de 2!");
		}

	}
	
	public static int multiplode2(int x) {
		return x % 2;
	}

}
