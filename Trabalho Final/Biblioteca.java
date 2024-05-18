package Biblioteca;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	List<Usuario> usuarios;
	List<Livro> estoque;
	
	public Biblioteca() {
		this.usuarios = new ArrayList<>();
		this.estoque = new ArrayList<>();
	}
	
	public void emprestimo(Usuario usuario, Livro livro) {
		if (this.estoque.contains(livro)) {
			Emprestimo emprestimo = new Emprestimo(livro);
		}
	}
}
