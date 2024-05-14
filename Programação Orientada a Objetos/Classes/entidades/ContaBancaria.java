package entidades;

public class ContaBancaria {
	
	public String titular;
	public int numero;
	public double saldo;
	public double saldoFinal;
	
	public double depositar(double x) {
		return(saldo += x);
	}
	
	public double sacar(double x) {
		if (saldo < 0) {
			saldo = 0;
		}
		return (saldo -= x);
	}
}
