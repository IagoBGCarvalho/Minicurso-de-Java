package FomasGeometricas;

public class Quadrado implements InterfaceFiguraGeometrica {
	
	double lado;
	
	public double calcularArea() {
		return (lado * lado);
	}
	
	public double calcularPerimetro() {
		return (lado * 4);
	}
	

}