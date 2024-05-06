import java.util.Scanner;
public class Atividade03 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double operando1 = 0;
		double operando2 = 0;
		int operacao = 0;
		double resultado = 0;
		
		// Entrada de dados
		
		System.out.print("Informe o operando 1: ");
		operando1 = leitor.nextDouble();
		
		System.out.print("Informe o operando 2: ");
		operando2 = leitor.nextDouble();
		
		System.out.print("Informe a operação desejada (1 - soma, 2 - subtração, 3 - divisão, 4 - multiplicação): ");
		operacao = leitor.nextInt();
		
		leitor.close();
		
		// Saída de dados
		
		switch (operacao) {
				case 1:
						resultado = (operando1 + operando2);
						break;
				case 2:
						resultado = (operando1 - operando2);
						break;
				case 3:
						resultado = (operando1 / operando2);
						break;
				case 4:
						resultado = (operando1 * operando2);
						break;
					
		}
		
		// Saída de dados
		
		if (operacao == 1) {
			System.out.println("O resultado da soma é: " + resultado);
		} else if (operacao == 2) {
			System.out.println("O resultado da subtração é: " + resultado);
		} else if (operacao == 3) {
			System.out.println("O resultado da divisão é: " + resultado);
		} else if (operacao == 4){
			System.out.println("O resultado da multiplicação é: " + resultado);
		} else {
			System.out.println("Digite uma operação válida");
		}
		
	}

}
