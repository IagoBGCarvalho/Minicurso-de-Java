import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		String frase;
		
		// Entrada de dados

        System.out.print("Digite uma frase: ");
        frase = leitor.nextLine();

        int contadorVogais = contarVogais(frase);
        
        // Saída de dados

        System.out.println("A frase tem " + contadorVogais + " vogais.");

        leitor.close();
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
	}

}

