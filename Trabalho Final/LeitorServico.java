import java.util.Scanner;
import java.util.UUID;

public class LeitorServico {
    private final Scanner leitor;

    public LeitorServico() {
        this.leitor = new Scanner(System.in);
    }

    public void close() {
        this.leitor.close();
    }

    public String lerNomeUsuario() {
        System.out.print("Digite o nome de usuario: ");
        return this.leitor.next().trim();
    }

    public String lerNovoNomeUsuario() {
        System.out.print("Digite o novo nome do usuario: ");
        return this.leitor.next().trim();
    }

    public String lerNomeLivro() {
        System.out.print("Digite o nome do livro: ");
        return this.leitor.next().trim();
    }

    public int lerOpcao() {
        System.out.print("""
                Digite a opcao desejada:
                1 - Fazer emprestimo
                2 - Devolver emprestimo
                3 - Buscar Livros
                4 - Gerenciar Usuarios
                5 - Gerenciar Livros
                6 - Sair
                >
                """);
        return this.leitor.nextInt();
    }

    public int lerOpcaoBuscarLivro() {
        System.out.print("""
                Buscar por:
                1 - Titulo
                2 - ISBN
                3 - Autor
                """);
        return this.leitor.nextInt();
    }

    public String lerAutor() {
        System.out.print("Insira o nome do autor: ");
        return this.leitor.next().trim();
    }

    public UUID lerID() {
        System.out.print("Insira o ID: ");
        return UUID.fromString(this.leitor.next().trim());
    }

    public int lerQuantidade() {
        System.out.print("Insira a quantidade: ");
        return this.leitor.nextInt();
    }

    public int lerOpcaoGerenciar() {
        System.out.print("""
                Gerenciar:
                1 - Inserir
                2 - Deletar
                3 - Alterar
                >
                """
        );
        return this.leitor.nextInt();
    }

}
