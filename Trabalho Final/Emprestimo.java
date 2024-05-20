import java.util.Date;
import java.util.UUID;

public class Emprestimo extends Entidade {
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Usuario usuario;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    private Livro livro;

    public Emprestimo(Usuario usuario, Livro livro, Date dataEmprestimo) {
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
        this.setId(UUID.randomUUID());
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
