public class Livro extends EntidadeComNome {
    private String autor;
    private int quantidadeEmEstoque;

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return this.getNome() + " por " + this.getAutor() + " (" + this.getId() + " : " + this.getQuantidadeEmEstoque() + ")";
    }
}
