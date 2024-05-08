import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int candidato = 0;
		
		// Entrada de dados
		System.out.print("Digite um número: ");
		candidato = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados: 
		
		if (numeroPerfeito(candidato)) {
			System.out.println(candidato + " é um número perfeito!");
		} else {
			System.out.println("Não é um número perfeito.");
		}
		
	}
	
	public static Boolean numeroPerfeito (int x) {
		int somaDivisores = 0;
		for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                somaDivisores += i;
            }
        }
		return somaDivisores == x;
	}

}
