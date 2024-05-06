import java.util.Scanner;
public class ExercicioCabuloso {
	public static void main(String[] args) {
		// Declaracao de variaveis e entrada de dados
		Scanner leitor = new Scanner(System.in);
		
		int bandejaCopos = 0;
		int bandejaLatas = 0;
		int totalCoposQuebrados = 0;
		
		do {
			
			System.out.print("quantos latas tem na bandeja? ");
			bandejaLatas = leitor.nextInt();
			System.out.print("quantas copos tem na bandeja? ");
			bandejaCopos =leitor.nextInt();
		
			System.out.print("O garçom levou mais bandejas? Insira S para adicionar outra bandeija." );
			
		}while(leitor.next().equalsIgnoreCase("S"));
		
		totalCoposQuebrados += CalcularCoposQuebrados(bandejaLatas, bandejaCopos);
		
		leitor.close();
		
		// Saida de dados
		
		System.out.println("O total de copos quebrados é: " + totalCoposQuebrados);

	}
	
	public static int CalcularCoposQuebrados(int x, int y) {
		if (x > y) {
			return y;
		} else {
			return 0;
		}
	}

}
