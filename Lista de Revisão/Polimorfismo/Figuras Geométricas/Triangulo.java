package FomasGeometricas;

public class Triangulo extends FiguraGeometrica {
	
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
