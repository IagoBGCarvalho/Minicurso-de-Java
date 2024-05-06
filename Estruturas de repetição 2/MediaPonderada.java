import java.util.Scanner;
public class MediaPonderada {
	public static void main(String[] args) {
        // Declaracao de variaveis e entrada de dados
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual a quantidade de notas do aluno? ");
        int total = leitor.nextInt();
        
        double[] notas = new double[total];
        
        for (int i = 0; i < total; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = leitor.nextDouble();
        }
        
        System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
        char opcao = leitor.next().charAt(0);
        
        double media;
        if (opcao == 'A' || opcao == 'a') {
            media = mediaAritmetica(notas);
        } else if (opcao == 'P' || opcao == 'p') {
            media = mediaPonderada(notas);
        } else {
            System.out.println("Opção inválida!");
            return;
        }
        
        leitor.close();
        
        // Saida de dados
        System.out.println("A média é: " + media);
    }
    
    public static double mediaAritmetica(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    
    public static double mediaPonderada(double[] notas) {
        if (notas.length != 3) {
            System.out.println("Para média ponderada, é necessário fornecer 3 notas.");
            return 0;
        }
        
        double media = (notas[0] * 5 + notas[1] * 3 + notas[2] * 2) / 10;
        return media;
    }
}
