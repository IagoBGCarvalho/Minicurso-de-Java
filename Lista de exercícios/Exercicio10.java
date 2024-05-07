import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		int x5 = 0;
		int x6 = 0;
		int x7 = 0;
		int x8 = 0;
		int x9 = 0;
		int x10 = 0;
	
		
		// Entrada de dados
		System.out.print("Digite o número desejado: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		// processamento
		
		x1 = (numero * 1);
		x2 = (numero * 2);
		x3 = (numero * 3);
		x4 = (numero * 4);
		x5 = (numero * 5);
		x6 = (numero * 6);
		x7 = (numero * 7);
		x8 = (numero * 8);
		x9 = (numero * 9);
		x10 = (numero * 10);
		
		
		// Saída de dados
		System.out.println("A tabuada do " + numero + " é:");
		System.out.println(numero + " x 1 = " + x1);
		System.out.println(numero + " x 2 = " + x2);
		System.out.println(numero + " x 3 = " + x3);
		System.out.println(numero + " x 4 = " + x4);
		System.out.println(numero + " x 5 = " + x5);
		System.out.println(numero + " x 6 = " + x6);
		System.out.println(numero + " x 7 = " + x7);
		System.out.println(numero + " x 8 = " + x8);
		System.out.println(numero + " x 9 = " + x9);
		System.out.println(numero + " x 10 = " + x10);
		
		
	}

}
