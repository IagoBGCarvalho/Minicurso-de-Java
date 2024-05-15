import java.util.Scanner;

public class Aula02Exercicio08 {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        
        double x = 0;
        double y = 0;
        
        // Entrada de dados
        
        System.out.println("Digite o valor de X: ");
        x = leitor.nextDouble();
        
        System.out.println("Digite o valor de Y: ");
        y = leitor.nextDouble();
        
        leitor.close();
        
        // Saída de dados
        
        if (x > 0 && y > 0) {
            System.out.println("Está no primeiro quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Está no segundo quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Está no terceiro quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("Está no quarto quadrante");
        } else if (x == 0 && y == 0) {
            System.out.println("Está na origem");
        } else if (x == 0) {
            System.out.println("Está sobre o eixo Y");
        } else if (y == 0) {
            System.out.println("Está sobre o eixo X");
        }
    }
}
