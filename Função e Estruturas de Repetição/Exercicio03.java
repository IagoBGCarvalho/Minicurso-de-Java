import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		// Declaracao de variaveis e entrada de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de numeros a serem calculados? ");
		int total = leitor.nextInt();
		
		double soma = 0;
		
		for (int i = 0; i < total; i++) {
			System.out.print("Digite o numero: ");
			double numero = leitor.nextDouble();
			soma += numero;
		}
		
		double media = mediaAritmetica(soma, total);
		
		leitor.close();
		
		// Saida de dados
		
		System.out.println("A media é: " + media);
		
	}
	
	public static double mediaAritmetica(double x, double y) {
		return x / y;
	}

}
