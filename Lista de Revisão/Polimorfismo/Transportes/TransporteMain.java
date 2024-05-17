package Transporte;

import java.util.Scanner;

public class TransporteMain {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        
        int opcao = 0;
        int opcao2 = 0;
        int opcao3 = 0;
        int opcao4 = 0;
        
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();
        
        // Entrada de dados
        System.out.print("Digite o transporte desejado (1 - Carro, 2 - Moto, 3 - Caminhão): ");
        opcao = leitor.nextInt();
        
        // Saída de dados
        switch (opcao) {
            case 1:
                System.out.print("Digite a ação desejada (1 - Acelerar, 2 - Frear, 3 - Virar): ");
                opcao2 = leitor.nextInt();
                if (opcao2 == 1) {
                    carro.acelerar();
                } else if (opcao2 == 2) {
                    carro.frear();
                } else if (opcao2 == 3) {
                    carro.virarVeiculo();
                } else {
                    System.out.println("Digite uma ação válida!");
                }
                break;
                
            case 2:
                System.out.print("Digite a ação desejada (1 - Acelerar, 2 - Frear, 3 - Virar): ");
                opcao3 = leitor.nextInt();
                if (opcao3 == 1) {
                    moto.acelerar();
                } else if (opcao3 == 2) {
                    moto.frear();
                } else if (opcao3 == 3) {
                    moto.virarVeiculo();
                } else {
                    System.out.println("Digite uma ação válida!");
                }
                break;
                
            case 3:
                System.out.print("Digite a ação desejada (1 - Acelerar, 2 - Frear, 3 - Virar): ");
                opcao4 = leitor.nextInt();
                if (opcao4 == 1) {
                    caminhao.acelerar();
                } else if (opcao4 == 2) {
                    caminhao.frear();
                } else if (opcao4 == 3) {
                    caminhao.virarVeiculo();
                } else {
                    System.out.println("Digite uma ação válida!");
                }
                break;
                
            default:
                System.out.println("Opção de transporte inválida!");
        }
        
        leitor.close();
    }
}
