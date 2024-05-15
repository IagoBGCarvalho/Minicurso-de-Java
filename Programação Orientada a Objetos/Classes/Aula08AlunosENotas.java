import java.util.Scanner;
import entidades.Aluno;
public class Aula08AlunosENotas {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		// Entrada de dados
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = leitor.next();
		
		System.out.print("Digite a matrícula do aluno: ");
		aluno.matricula = leitor.nextInt();
		
		System.out.print("Digite a quantidade de notas: ");
		aluno.numeroNotas = leitor.nextInt();
		
		double [] vetor = new double[aluno.numeroNotas];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite a nota: ");
			vetor[i] = leitor.nextDouble();
			aluno.totalNotas += vetor[i];
		}
		
		leitor.close();
		
		// Processamento
		
		double media = aluno.calcularMedia();
		
		if (media > 6) {
			System.out.println("A média do aluno " + aluno.nome + " de matrícula: " + aluno.matricula + " foi: " + aluno.calcularMedia() + " (Aprovado!)");
		} else {
			System.out.println("A média do aluno " + aluno.nome + " de matrícula: " + aluno.matricula + " foi: " + aluno.calcularMedia() + " (Reprovado.)");
		}
	}
}
