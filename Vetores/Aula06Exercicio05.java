import java.util.Scanner;
public class Aula06Exercicio05 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int tamanho = 0;
		
		// Entrada de dados
		System.out.print("Qual o tamanho do conjunto? ");
		tamanho = leitor.nextInt();
		
		String [] vetorNome = new String[tamanho];
		int [] vetorIdade = new int[tamanho];
		
		for(int i = 0; i < vetorNome.length; i++) {
			System.out.print("Informe o nome: ");
			vetorNome[i] = leitor.next();
			System.out.print("Informe a idade: ");
			vetorIdade[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Saída de dados
		System.out.println("| Nome | Idade |");
		for(int i = 0; i < vetorNome.length; i++) {
			System.out.println("| " + vetorNome[i] + " | " + vetorIdade[i] + " |");
		}
	}

}
