package entidades;

public class Produto {
	
	public String nomeProduto;
	public double precoProduto;
	public int quantidadeProduto;
	public int precoTotal;
	
	public int adicionarProduto(int x) {
		return (quantidadeProduto += x);
	}
	
	public int removerProduto(int x) {
		if (quantidadeProduto < 0) {
			quantidadeProduto = 0;
		}
		return (quantidadeProduto -= x);
		
	}
	
	public double precoTotal() {
		return (precoProduto * quantidadeProduto);
	}
}
