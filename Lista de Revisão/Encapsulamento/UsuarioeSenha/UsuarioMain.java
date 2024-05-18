package UsuarioeSenha;
import java.util.Scanner;
public class UsuarioMain {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		// Entrada de dados
		
		usuario.setUsuario ("Iago");
		usuario.setSenha("1234");
		
		// Saída de dados
		
		System.out.println(usuario.getUsuario());
		System.out.println(usuario.getSenha());
		
		leitor.close();
	}

}
