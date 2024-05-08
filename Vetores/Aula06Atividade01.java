import java.util.Scanner;
public class Aula06Atividade01 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int [] array = new int [7];
		
		int numero = 0;
		
		// Entrada de dados
		
		System.out.print("Digite o número desejado: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		 // Processamento
		
		array[0] += numero;
		array[6] += numero;
		
		// Saída de dados
		
		for (int i = 0; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}

}
