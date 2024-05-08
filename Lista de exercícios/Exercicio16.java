import java.util.Scanner;
public class Exercicio16 {
	 public static void main(String[] args) {
		 // Declaração de variáveis
	     Scanner leitor = new Scanner(System.in);
	     
	     String numero;
	      
	      // Entrada de dados
	     
	      System.out.print("Digite um número binário: ");
	      numero = leitor.nextLine();
	      leitor.close();
	      int decimal = binarioParaDecimal(numero);
	      
	      // Saída de dados
	      System.out.println("O número binário " + numero + " em decimal é: " + decimal);
	  }
	    
	    public static int binarioParaDecimal(String x) {
	        int decimal = 0;
	        int tamanho = x.length();
	        
	        for (int i = 0; i < tamanho; i++) {
	            int digito = Character.getNumericValue(x.charAt(i));
	            decimal += digito * Math.pow(2, tamanho - 1 - i);
	        }
	        
	        return decimal;
	    }

}
