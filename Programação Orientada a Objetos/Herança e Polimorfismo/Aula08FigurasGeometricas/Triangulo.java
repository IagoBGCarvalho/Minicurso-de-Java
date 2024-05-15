package Aula08;

public class Triangulo {
	
	double base;
	double lado1;
	double lado2;
	double altura;
	
	double calcularArea() {
		return ((base * altura) / 2);
	}
	
	double calcularPerimetro() {
		return (base * lado1 * lado2);
	}

}
