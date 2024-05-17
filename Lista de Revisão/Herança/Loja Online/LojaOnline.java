package LojaOnline;

public class LojaOnline {
	public static void main(String[] args) {
		// Declaração de variáveis
		Livro Livro = new Livro();
		Eletronico Eletronico = new Eletronico();
		Roupa Roupa = new Roupa();
		
		// Entrada de dados
		
		Livro.nome = "A República";
		Livro.preco = 50;
		Livro.numeroPaginas = 200;
		
		Eletronico.nome = "Notebook Positivo";
		Eletronico.preco = 2000;
		Eletronico.tamanhoTela = 15;
		
		Roupa.nome = "Camisola";
		Roupa.preco = 30;
		Roupa.tamanho = "G";
		
		// Saída de dados
		System.out.println("Livro: ");
		System.out.println("Nome: " + Livro.nome);
		System.out.println("Preço: " + Livro.preco + "R$");
		System.out.println("Número de páginas: " + Livro.numeroPaginas);
		Livro.legível();
		
		System.out.println();
		
		System.out.println("Eletronico: ");
		System.out.println("Nome: " + Eletronico.nome);
		System.out.println("Preço: " + Eletronico.preco + "R$");
		System.out.println("Tamanho da tela: " + Eletronico.tamanhoTela + " polgadas");
		Eletronico.funcionar();

		System.out.println();
		
		System.out.println("Roupa: ");
		System.out.println("Nome: " + Roupa.nome);
		System.out.println("Preço: " + Roupa.preco + "R$");
		System.out.println("Tamanho: " + Roupa.tamanho);
		Roupa.vestir();
		
		System.out.println();
		
	}
}
