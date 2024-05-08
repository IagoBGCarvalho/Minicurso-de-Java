import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a quantidade de notas do aluno? ");
        int total = leitor.nextInt();

        double[] notas = new double[total];
        double[] pesos = new double[total];

        // Solicitar as notas e pesos do usuário
        for (int i = 0; i < total; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
            System.out.print("Digite o peso para a nota " + (i + 1) + ": ");
            pesos[i] = leitor.nextDouble();
        }

        double media = mediaPonderada(notas, pesos);

        // Saída de dados
        System.out.println("A média ponderada é: " + media);

        leitor.close();

    }

    public static double mediaPonderada(double[] notas, double[] pesos) {
        double somaNotas = 0;
        double somaPesos = 0;

        if (notas.length != pesos.length) {
            System.out.println("O número de notas deve ser igual ao número de pesos.");
            return 0;
        }

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double media = somaNotas / somaPesos;
        return media;
    }
}