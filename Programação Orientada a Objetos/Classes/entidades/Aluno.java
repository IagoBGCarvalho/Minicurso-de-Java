package entidades;

public class Aluno {
	
	public String nome;
    public int matricula;
    public int numeroNotas;
    public double totalNotas;
    
    public double calcularMedia() {
    	return (totalNotas / numeroNotas);
    }

}
