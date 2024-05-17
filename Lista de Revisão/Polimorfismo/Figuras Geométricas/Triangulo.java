package FomasGeometricas;

public class Triangulo implements InterfaceFiguraGeometrica {
	
	double base;
	double lado1;
	double lado2;
	double altura;
	
	public double calcularArea() {
		return ((base * altura) / 2);
	}
	
	public double calcularPerimetro() {
		return (base * lado1 * lado2);
	}

}
