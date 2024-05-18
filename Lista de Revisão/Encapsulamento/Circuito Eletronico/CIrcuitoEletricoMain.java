package CircuitoEletrico;

public class CIrcuitoEletricoMain {
	
public static void main(String[] args) {
		
		Circuito circuito = new Circuito();	
		
		circuito.gettensao();
		circuito.settensao(220);
		
		circuito.getcorrente();
		circuito.setcorrente(5);
		
        System.out.println("Tensão: " + circuito.gettensao() + " V");
        System.out.println("Corrente: " + circuito.getcorrente() + " A");

        System.out.println("Resistência: " + circuito.CalcularResistencia() + " Ω");

        System.out.println("Potência Dissipada: " + circuito.CalcularPotenciaDissipada() + " W");

        circuito.settensao(110);
        circuito.setcorrente(10);

        System.out.println("\nApós a alteração:");
        System.out.println("Tensão: " + circuito.gettensao() + " V");
        System.out.println("Corrente: " + circuito.getcorrente() + " A");

        System.out.println("Resistência: " + circuito.CalcularResistencia() + " Ω");

        System.out.println("Potência Dissipada: " + circuito.CalcularPotenciaDissipada() + " W");
	}

}
