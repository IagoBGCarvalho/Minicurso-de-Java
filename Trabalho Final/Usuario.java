import java.util.ArrayList;
import java.util.List;

public class Usuario extends EntidadeComNome {
    List<Livro> livrosEmprestados;

    public Usuario() {
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public List<Livro> getLivrosEmprestados() {
        return new ArrayList<>(livrosEmprestados);
    }

    public void addLivro(Livro livro) {
        this.livrosEmprestados.add(livro);
    }

    public void removeLivro(Livro livro) {
        this.livrosEmprestados.remove(livro);
    }
}
