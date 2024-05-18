package Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Biblioteca {
	
	private String nome;
    private String id;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
	
	

}
