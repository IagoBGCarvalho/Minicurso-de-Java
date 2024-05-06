import java.util.Scanner;
public class Atividade04 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		
		// Entrada de dados
		
		System.out.println("Digite o valor de X: ");
		x = leitor.nextDouble();
		
		System.out.println("Digite o valor de Y: ");
		y = leitor.nextDouble();
		
		leitor.close();
		
		// Saída de dados
		
		if (x>0 && y>0) {
			System.out.println("É o primeiro quadrante");
		}else if (x<0 && y>0) {
			System.out.println("É o segundo quadrante");
		}else if (x<0 && y<0) {
			System.out.println("É o terceiro quadrante");
		}else if (x>0 && y<0) {
			System.out.println("É o quarto quadrante");
		}else {
			System.out.println("Esse é a origem");
		}
	}

}
