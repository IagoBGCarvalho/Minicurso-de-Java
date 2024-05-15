package Aula08;

public class Quadrado extends FiguraGeometrica {
	
	double lado;
	
	double calcularArea() {
		return (lado * lado);
	}
	
	double calcularPerimetro() {
		return (lado * 4);
	}
	

}
