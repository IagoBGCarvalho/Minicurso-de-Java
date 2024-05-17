package InstrumentosMusicais;
import java.util.Scanner;
public class InstrumentosMusicaisMain {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int opcao = 0;
		
		Violao violao = new Violao();
		Piano piano = new Piano();
		Flauta flauta = new Flauta();
		
		// Entrada de dados
		do {
		System.out.print("Digite qual instrumento deseja (1 - Violão, 2 - Piano, 3 - Flauta): ");
		opcao = leitor.nextInt();
		
		// Saída de dados
		if (opcao == 1) {
			
			violao.tocarNota();
			violao.afinarInstrumento();
			
		} else if (opcao == 2) {
			
			piano.tocarNota();
			piano.afinarInstrumento();
			
		} else if (opcao == 3) {
			
			flauta.tocarNota();
			flauta.afinarInstrumento();
			
		} else {
			System.out.println("Digite uma opção válida.");
		}
		
		System.out.print("Deseja afinar outro instrumento? Digite <S> para tocar novamente: ");
		} while (leitor.next().equalsIgnoreCase("S"));
		
		leitor.close();
	}

}
