package UsuarioeSenha;

public class Usuario {
	
	private String Usuario;
	private String Senha;
	
	public String getUsuario() {
		return Usuario ;
	}
	public String getSenha(){
		return Senha;
	}
	public void setUsuario(String novoUser) {
		this.Usuario = novoUser;
		
	}
	public void setSenha(String novaSenha) {
		this.Senha = novaSenha;
		
	}


}
