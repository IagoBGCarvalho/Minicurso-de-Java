import java.util.Scanner;
public class linhaquadradocubo {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		
		// Entrada de dados
		
		System.out.print("Digite um número inteiro positivo N: ");
        numero = leitor.nextInt();
        
        // Saída de dados
        
        for (int i = 1; i <= numero; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-5d %-5d %-5d%n", i, quadrado, cubo);
        }
        
        leitor.close();
        
	}

}
