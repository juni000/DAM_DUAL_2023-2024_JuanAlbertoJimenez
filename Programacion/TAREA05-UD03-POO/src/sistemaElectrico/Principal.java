package sistemaElectrico;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double kms = 0, litros = 0, vmed = 0;

		Consumo primer = new Consumo();
		System.out.println("INICIO ---> Número de objetos consumo: " + Consumo.getnumobj());
		
		System.out.println("Pgas (antes de cambiar): " + Consumo.getPgas());
		Consumo.setPgas(1.7);
		System.out.println("Pgas (despues de cambiar): " + Consumo.getPgas());
		
		System.out.println("Introduce kms");
		kms = teclado.nextDouble();
		System.out.println("Introduce litros");
		litros = teclado.nextDouble();
		System.out.println("Introduce velocidad media");
		vmed = teclado.nextDouble();
		Consumo segundo = new Consumo(kms, litros, vmed);
		
		primer.getInfo();
		
		System.out.println("Atributos del pirmer objeto: " + primer.getKms() + " kms, " + primer.getLitros()
				+ " litros, " + primer.getVmed() + " velocidad media, " + Consumo.getPgas() + " precio gas.");
		System.out.println("Consumo medio del primer objeto: " + primer.consumoMedio());
		System.out.println("Tiempo de segundo objeto: " + segundo.tiempo() + " h");
		System.out.println("Consumo medio por cada 100km del segundo objeto: " + segundo.consumoMedio() + " L");
		System.out.println("Consumo Euros por cada 100km del segundo objeto: " + segundo.consumoEuros() + "€");
		
		System.out.println("FINAL ---> Número de objetos consumo: " + Consumo.getnumobj());

		teclado.close();
	}
	

}
