package Biblioteca;
import java.util.Date;

public class Emprestimo {
	private Livro livroEmprestado;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	
	public Emprestimo(Livro livro) {
		this.livroEmprestado = livro;
		this.dataEmprestimo = new Date();
		this.dataDevolucao = null;
		
	}
	
	public void devolver() {
		this.dataDevolucao = new Date();
	}
	
	public Livro getLivroEmprestado() {
		return this.livroEmprestado;
	}
	public Date getDataEmprestimo() {
		return this.dataEmprestimo;
	}
	public Date getDataDevolucao() {
		return this.dataDevolucao;
	}
}
