package Biblioteca;

public class Livro extends Biblioteca {
	
	private String titulo;
    private String autor;
    private String isbn;
    private int quantidadeEmEstoque;

    public Livro(String titulo, String autor, String isbn, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return titulo + " by " + autor;
    }

}