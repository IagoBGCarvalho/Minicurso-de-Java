import java.util.Scanner;
import entidades.ContaBancaria;
public class Aula08ContasBancarias {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numeroOperacao;
		
		ContaBancaria conta = new ContaBancaria();
		
		// Entrada de dados
		System.out.print("Digite o nome do titular: ");
		conta.titular = leitor.next();
		
		System.out.print("Digite o número da conta: ");
		conta.numero = leitor.nextInt();
		
		System.out.print("Digite o saldo da conta: ");
		conta.saldo = leitor.nextInt();
		
		System.out.print("Digite qual serviço deseja utilzar (1 - Saque, 2 - Depósito, 3 - Verificar saldo): ");
		numeroOperacao = leitor.nextInt();
				
		// Saída de dados
		
		if (numeroOperacao == 1) {
			System.out.print("Digite o valor do saque: ");
			double valorSaque = leitor.nextDouble();
			conta.saldoFinal = conta.sacar(valorSaque);
			System.out.println("O saldo final é: " + conta.saldoFinal);
		} else if (numeroOperacao == 2) {
			System.out.print("Digite o valor do depósito: ");
			double valorDeposito = leitor.nextDouble();
			conta.saldoFinal = conta.depositar(valorDeposito);
			System.out.println("O saldo final é: " + conta.saldoFinal);
		} else if (numeroOperacao == 3) {
			conta.saldoFinal = conta.saldo;
			System.out.println("O saldo em conta é: " + conta.saldoFinal);
		} else {
			System.out.println("Digite uma operação válida.");
		}
		
		leitor.close();
			
	}

}
