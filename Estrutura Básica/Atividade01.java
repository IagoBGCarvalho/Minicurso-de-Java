import java.util.Scanner;
public class Atividade01 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		double areaTriangulo = 0;
		double areaCirculo = 0;
		double areaTrapezio = 0;
		double areaQuadrado = 0;
		double areaRetangulo = 0;
		
		// Entrada de dados
		
		System.out.print("Qual o valor de A: ");
		a = leitor.nextDouble();
		
		System.out.print("Qual o valor de B: ");
		b = leitor.nextDouble();
		
		System.out.print("Qual o valor de C: ");
		c = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		areaTriangulo = ((a * c) / 2);
		areaCirculo = (3.1415 * c * c);
		areaTrapezio = (((a + b) * c) / 2);
		areaQuadrado = (b * b);
		areaRetangulo = (a * b);
		
		// Saída de dados
		
		System.out.println("Triangulo: " + areaTriangulo);
		System.out.println("Circulo: " + areaCirculo);
		System.out.println("Trapezio: " + areaTrapezio);
		System.out.println("Quadrado: " + areaQuadrado);
		System.out.println("Retangulo: " + areaRetangulo);
		
		
	}

}
