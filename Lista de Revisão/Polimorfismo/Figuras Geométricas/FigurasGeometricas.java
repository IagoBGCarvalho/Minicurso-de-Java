package FomasGeometricas;
import java.util.Scanner;

public class FigurasGeometricas {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int opcao = 0;
		
		Quadrado Quadrado = new Quadrado();
		Circulo Circulo = new Circulo();
		Triangulo Triangulo = new Triangulo();
		
		// Entrada de dados
		
		System.out.print("Digite a forma geométrica desejada (1 - Quadrado, 2 - Circulo, 3 - Triângulo): ");
		opcao = leitor.nextInt();
		
		switch (opcao) {
		
		case 1: 
			
			System.out.print("Digite a medida do lado do quadrado: ");
			Quadrado.lado = leitor.nextDouble();
			System.out.println("A área do quadrado é: " + Quadrado.calcularArea());
			System.out.println("O perímetro do quadrado é: " + Quadrado.calcularPerimetro());
			break;
			
		case 2:
			
			System.out.print("Digite o raio da circunferẽncia: ");
			Circulo.raio = leitor.nextDouble();
			System.out.println("A área do círculo é: " + Circulo.calcularArea());
			System.out.println("O perímetro do círculo é: " + Circulo.calcularPerimetro());
			break;
			
		case 3:
			
			System.out.print("Digite a base do triângulo: ");
			Triangulo.base = leitor.nextDouble();
			System.out.print("Digite a altura do triângulo: ");
			Triangulo.altura = leitor.nextDouble();
			System.out.print("Digite a medida do lado 1: ");
			Triangulo.lado1 = leitor.nextDouble();
			System.out.print("Digite a medida do lado 2: ");
			Triangulo.lado2 = leitor.nextDouble();
			System.out.println("A área do triângulo é: " + Triangulo.calcularArea());
			System.out.println("O perímetro do triângulo é: " + Triangulo.calcularPerimetro());
			break;
			
		}
		
		leitor.close();
		
	}

}