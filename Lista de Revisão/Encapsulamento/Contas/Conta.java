package Conta;

public class Conta {
	
	private double saldo;
    private String titular;
    
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
	}

    public void setTitular(String Titular) {
    	this.titular = Titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

}
