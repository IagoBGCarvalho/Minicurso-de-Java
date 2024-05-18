package Biblioteca;
import java.util.Scanner;

public class BibliotecaMain {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		// Usuario usuario = new Usuario();
		// Livro livro = new Livro();
		// Emprestimo emprestimo = new Emprestimo();
		
		int opcao = 0;
		int opcaoLivro = 0;
		Boolean exit = false;
		Biblioteca biblioteca = new Biblioteca();
		
		// Entrada de dados
		
		do {
		
		System.out.print("Digite a opcão desejada (1 - Empréstimo, 2 - Devolução, "
				+ "3 - Buscar, 4 - Gerenciar usuários, 5 - Gerenciar livros): ");
		opcao = leitor.nextInt();
		
			
		switch (opcao) {
		
		case 1:
			System.out.println("Digite o nome do livro: ");
			String livro = leitor.next();
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			
			System.out.print("Digite o nome do usuário: ");
			
			System.out.print("Digite a senha do usuário: ");
			
			break;
			
		case 5:
			break;
		case 6:
			break;
		}
		
		} while (!exit);
		
		// Saída de dados
	}
	
	

}
