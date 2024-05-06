import java.util.Scanner;
public class Exercicio06 {
	public static void main(String[] args) {
		// Declaração de variáveis
		
		Scanner leitor = new Scanner(System.in);
		String frase;
		String resultado;
		
		// Entrada de dados
		
        System.out.print("Digite uma string: ");
        frase = leitor.nextLine();
        
        leitor.close();
        
        resultado = frase.replaceAll("[AEIOUaeiou]", "");
        
        // Saída de dados
        
        System.out.println("Resultado após a remoção das vogais: " + resultado);
        
	}

}
