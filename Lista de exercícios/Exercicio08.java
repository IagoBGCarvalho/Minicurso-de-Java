import java.util.Scanner;
public class Exercicio08 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
				
		double temperaturaCelcius = 0;
		double temperaturaFahrenheit = 0;
				
		// Entrada de dados
		System.out.print("Digite a temperatura em Celcius ");
		temperaturaCelcius = leitor.nextDouble();
				
		leitor.close();
				
		// Processamento
		temperaturaFahrenheit = (32 + (9 * temperaturaCelcius / 5));
				
		// Saída de dados
		System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
	}

}
