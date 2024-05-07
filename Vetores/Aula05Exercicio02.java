import java.util.Scanner;
public class Aula05Exercicio02 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
	
		int tipoCombustivel;
		int [] contadores = new int [3];
		
		// Entrada de dados
		
		do {
			
			System.out.println("Informe o tipo de combustivel");
			System.out.println("1-alcool");
			System.out.println("2-gasolina");
			System.out.println("3-diessel");
			System.out.println("4-fim");
			tipoCombustivel = leitor.nextInt();
			
			if (tipoCombustivel >= 1 && tipoCombustivel <=3) {
				contadores[tipoCombustivel -1]++;
			} else if (tipoCombustivel != 4) {
				System.out.println("Código inválido!");
			}
		
			
		} while (tipoCombustivel != 4);
		
		// Saída de dados
		
		System.out.println("Obrigado");
		System.out.println("Alccol " +contadores[0] );
		System.out.println("Gasolina " + contadores [1]);
		System.out.println("Diessel " + contadores[2]);
			
		leitor.close();
		
	}

}
