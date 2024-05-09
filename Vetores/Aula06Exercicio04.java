import java.util.Scanner;
public class Aula06Exercicio04 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int n = 0;
		
		// Entrada de dados
		System.out.print("Digite o tamanho do vetor: ");
		n = leitor.nextInt();
		
		int [] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o número na posição [" + i + "] = ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Processamento 
		double numeroMaior = 0;
		double posicaoMaior = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > numeroMaior) {
				numeroMaior = vetor[i];
				posicaoMaior = i;
			}
		}
		
		// Saída de dados
		System.out.println("O número maior é: " + numeroMaior + " e está na posição: " + posicaoMaior);
	}

}
