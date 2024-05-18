package Conta;

public class ContaMain {
	public static void main(String[] args) {
		
		Conta conta = new Conta("João Silva", 500.00);
		
		conta.setTitular("Iago");
		conta.setSaldo(20.0);
        
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(200.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());
        
        conta.sacar(100.00);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        conta.sacar(-50.00);

        conta.sacar(700.00);
        System.out.println("Saldo final: R$ " + conta.getSaldo());

	}

}
