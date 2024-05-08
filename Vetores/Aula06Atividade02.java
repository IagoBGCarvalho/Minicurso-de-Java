import java.util.Scanner;
public class Aula06Atividade02 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int temp = 0;
		int numero1 = 0;
		int numero2 = 0;
		
		int [] vetor = new int [8];
		
		// Entrada de dados
		System.out.print("Digite o primeiro número (entre 0 e 7): ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número (entre 0 e 7): ");
		numero2 = leitor.nextInt();
		
		System.out.println("Digite a formatação original do vetor: ");
		for(int i = 0; i<vetor.length; i++) {
			vetor[i]=leitor.nextInt();
		}
		
		leitor.close();
		
		// Processamento
		
		temp = vetor[numero1];
		vetor[numero1] = vetor[numero2];
		vetor[numero2] = temp;
		
		// Saída de dados:
		System.out.println("Forma final do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
