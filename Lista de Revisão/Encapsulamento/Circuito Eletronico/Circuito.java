package CircuitoEletrico;

public class Circuito {
	
	private double tensao;
	private double corrente;
	
	public void CircuitoEletrico (double tensao, double corrente) {
		this.tensao = tensao;
		this.corrente = corrente;
	}
	public double gettensao() {
		return tensao;
	}
	public void settensao(double tensao) {
		this.tensao = tensao;
	}
	public double getcorrente() {
		return corrente;
	}
	public void setcorrente(double corrente) {
		this.corrente = corrente;
	}
	public double CalcularResistencia () {
		if (corrente ==0) {
			throw new ArithmeticException("A corrente não pode ser 0");
		}
		return tensao/corrente;
	}
	public double CalcularPotenciaDissipada() {
		return tensao * corrente;
	}

}