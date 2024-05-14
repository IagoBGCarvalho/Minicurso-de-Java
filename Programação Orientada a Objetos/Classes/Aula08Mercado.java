import java.util.Scanner;
import entidades.Produto;
public class Aula08Mercado {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int numeroOperacao;
		int quantidadeUnidades;
		double valorTotal;
		
		Produto produto = new Produto();
		
		// Entrada de dados
		
		System.out.print("Digite o nome do produto: ");
		produto.nomeProduto = leitor.next();
		
		System.out.print("Digite o preço do produto: ");
		produto.precoProduto = leitor.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		produto.quantidadeProduto = leitor.nextInt();
		
		System.out.print("Digite a operação que deseja realizar (1 - Adicionar unidades, 2 - Remover unidade, 3 - Calcular valor de estoque): ");
		numeroOperacao = leitor.nextInt();
		
		// Saída de dados
		
		if (numeroOperacao == 1) {
			System.out.print("Digite a quantidade de unidades a serem adicionadas: ");
			quantidadeUnidades = leitor.nextInt();
			produto.quantidadeProduto = produto.adicionarProduto(quantidadeUnidades);
			System.out.println("A quantidade final é: " + produto.quantidadeProduto);
		} else if (numeroOperacao == 2) {
			System.out.print("Digite a quantidade de unidades a serem removidas: ");
			quantidadeUnidades = leitor.nextInt();
			produto.quantidadeProduto = produto.removerProduto(quantidadeUnidades);
			System.out.println("A quantidade final é: " + produto.quantidadeProduto);
		} else if (numeroOperacao == 3) {
		    valorTotal = produto.precoTotal();
		    System.out.println("O valor total é: " + valorTotal);
		} else {
			System.out.println("Digite uma operação válida.");
		}
		
		leitor.close();
		
	}

}
