import java.util.Scanner;
public class Atividade02 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		int diferenca = 0;
		
		// Entrada de dados
		
		System.out.print("Qual o valor de A: ");
		a = leitor.nextInt();
		
		System.out.print("Qual o valor de B: ");
		b = leitor.nextInt();
		
		System.out.print("Qual o valor de C: ");
		c = leitor.nextInt();
		
		System.out.print("Qual o valor de D: ");
		d = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		diferenca = (a * b - c * d);
		
		// Saída de dados
		
		System.out.println("Diferença: " + diferenca);
	}

}
