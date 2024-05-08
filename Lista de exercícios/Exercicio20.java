import java.util.Scanner;
public class Exercicio20 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int ano = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o ano desejado: ");
		ano = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		anoBissexto(ano);
		
		// Saída de dados		
	}
	
	public static void anoBissexto (int x) {
		if (x % 4 == 0) {
			System.out.print("O ano é bissexto!");
		} else {
			System.out.println("Não é bissexto!");
		}
		
	}

}
