package FomasGeometricas;

public class Circulo implements InterfaceFiguraGeometrica {
	
	double raio;
	
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double calcularPerimetro() {
		return (2 * Math.PI * raio);
	}

}