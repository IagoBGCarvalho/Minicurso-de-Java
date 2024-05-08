import java.util.Scanner;
public class Exercicio18 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		String inputString;
		char caractere;
        
        // Entrada de dados
        System.out.print("Digite uma string: ");
        inputString = leitor.nextLine();
        
        System.out.print("Digite o caractere a ser contado: ");
        caractere = leitor.next().charAt(0);
        
       leitor.close();
        
        int ocorrencias = contar(inputString, caractere);
        
        // Saída de dados
        System.out.println(caractere + " ocorre " + ocorrencias + " vezes.");
        
    }
    
    public static int contar(String x, char y) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == y) {
                count++;
            }
        }
        return count;
	}

}
