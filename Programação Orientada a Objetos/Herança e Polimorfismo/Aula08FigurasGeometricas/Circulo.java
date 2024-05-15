package Aula08;

public class Circulo extends FiguraGeometrica {
	
	double raio;
	
	double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	double calcularPerimetro() {
		return (2 * Math.PI * raio);
	}

}
