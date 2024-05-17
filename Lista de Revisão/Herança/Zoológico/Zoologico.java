package Zoologico;

public class Zoologico {
	public static void main(String[] args) {
		// Declaração de variáveis
		
		Mamifero mamifero = new Mamifero();
		Ave ave = new Ave();
		Reptil reptil = new Reptil();
		
		// Entrada de dados
		
		mamifero.nome = "Vaca";
		mamifero.idade = 5;
		mamifero.litrosLeite = 8;
		
		ave.nome = "Cisne da Tundra";
		ave.idade = 3;
		ave.quantidadePenas = 25000;
		
		reptil.nome = "Iguana";
		reptil.idade = 1;
		reptil.quantidadeOvos = 10;
		
		// Saída de dados
		System.out.println("Mamífero: ");
		System.out.println("Nome: " + mamifero.nome);
		System.out.println("Idade: " + mamifero.idade);
		System.out.println("Quantidade produzida de leite dirariamente: " + mamifero.litrosLeite);
		mamifero.beberLeite();
		
		System.out.println();
		
		System.out.println("Ave: ");
		System.out.println("Nome: " + ave.nome);
		System.out.println("Idade: " + ave.idade);
		System.out.println("Quantidade de penas: " + ave.quantidadePenas);
		ave.terPenas();
		
		System.out.println();
		
		System.out.println("Réptil: ");
		System.out.println("Nome: " + reptil.nome);
		System.out.println("Idade: " + reptil.idade);
		System.out.println("Quantidade de ovos colocados: " + reptil.quantidadeOvos);
		reptil.manterTemperatura();
		
		System.out.println();
	}

}
