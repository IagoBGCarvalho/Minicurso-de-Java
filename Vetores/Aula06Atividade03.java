import java.util.Scanner;

public class Aula06Atividade03 {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);

        int numero = 0;

        // Entrada de dados
        System.out.print("Digite um número inteiro e positivo: ");
        numero = leitor.nextInt();

        int[] vetor = gerarPrimos(numero);
        
        leitor.close();

        // Saída de dados
        System.out.println("Os " + numero + " primeiros números primos são:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static int[] gerarPrimos(int n) {
        int[] primos = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            if (numeroPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        return primos;
    }

    public static boolean numeroPrimo(int x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
