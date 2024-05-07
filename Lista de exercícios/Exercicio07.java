import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {
		// Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        
        String palavra;

        // Entrada de dados
        System.out.print("Digite uma palavra: ");
        palavra = leitor.nextLine();

        // Saída de dados
        if (palindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo!");
        } else {
            System.out.println(palavra + " não é um palíndromo!");
        }
        
        leitor.close();
    }

    public static boolean palindromo(String palavra) {
    	
        palavra = palavra.toLowerCase();

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
	}

}
