package DispositivosEletronicos;

public class DispositivosEletronicos {
	public static void main(String[] args) {
		// Declaração de variáveis
		
		Notebook Notebook = new Notebook();
		Smartphone Smartphone = new Smartphone();
		Tablet Tablet = new Tablet();
		
		// Entrada de dados
		
		Notebook.marca = "Dell";
		Notebook.anoFabicracao = 2005;
		Notebook.camera = false;
		
		Smartphone.marca = "Iphone";
		Smartphone.anoFabicracao = 2024;
		Smartphone.armazenamento = 200;
		
		Tablet.marca = "Dell";
		Tablet.anoFabicracao = 2005;
		Tablet.tamanhoTela = 28;
		
		// Saída de dados
		System.out.println("Notebook: ");
		System.out.println("Marca: " + Notebook.marca);
		System.out.println("Ano de fabicração: " + Notebook.anoFabicracao);
		System.out.println("Camera imbutida: " + Notebook.camera);
		Notebook.notebookFuncionar();
		
		System.out.println();
		
		System.out.println("Smartphone: ");
		System.out.println("Marca: " + Smartphone.marca);
		System.out.println("Ano de fabicração: " + Smartphone.anoFabicracao);
		System.out.println("Armazenamento: " + Smartphone.armazenamento + "GB");
		Smartphone.smartphoneFuncionar();
		
		System.out.println();
		
		System.out.println("Tablet: ");
		System.out.println("Marca: " + Tablet.marca);
		System.out.println("Ano de fabicração: " + Tablet.anoFabicracao);
		System.out.println("Tamanho da tela: " + Tablet.tamanhoTela + " polegadas");
		Tablet.tabletFuncionar();
	}
	
}
