import java.util.Scanner;
public class Exercicio17 {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int limite1 = 0;
		int limite2 = 0;
		
		// Entrada de dados
        System.out.print("Digite o limite inferior do intervalo: ");
        limite1 = leitor.nextInt();

        System.out.print("Digite o limite superior do intervalo: ");
        limite2 = leitor.nextInt();

        System.out.println("Números primos no intervalo especificado = ");
        
        intervaloPrimos(limite1, limite2);
        
        leitor.close();
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
	
	public static void intervaloPrimos (int x, int y) {
		for (int i = x; i <= y; i++) {
            if (numeroPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
	}

}
