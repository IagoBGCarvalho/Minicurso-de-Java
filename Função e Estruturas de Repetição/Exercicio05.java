import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		String frase;
		char letraAntiga;
		char letraNova;
		
		// Entrada de dados
		System.out.print("Digite uma frase: ");
		frase = leitor.next();
		
		System.out.print("Informe a letra a ser substituida: ");
		letraAntiga = leitor.next().charAt(0);
		
		System.out.print("Informe a letra a substituir: ");
		letraNova = leitor.next().charAt(0);
		
		String novaFrase = frase.replace(letraAntiga, letraNova);
		
		leitor.close();
		
		// Saída de dados
		
		System.out.println("A nova frase é: " + novaFrase);
		
		
	}

}
