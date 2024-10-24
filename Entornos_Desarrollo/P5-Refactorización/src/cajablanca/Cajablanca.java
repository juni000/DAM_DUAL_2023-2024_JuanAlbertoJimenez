package cajablanca;

import java.util.Scanner;

public class Cajablanca {

	// Número entero aleatorio del 0 al rango de b -1
	private static int numeroAleatorio(int b) {
		return (int) (Math.random() * b - 1);
	}
	// Texto "Adivina el número del 1 al ... "
	public static void adivinaTexto() {
		System.out.print("Adivina el número del 1 al ... ");
	}

	public static void main(String[] args) {
		adivinaTexto();

		Scanner teclado = new Scanner(System.in);
		
		//Rango de los posibles números, por defecto 200
		int rango = 200;
		
		//Varable entera que se utiliza para el número aleatorio
		int numRandom = numeroAleatorio(rango);
		
		System.out.println(numRandom);
		
		int entrada = teclado.nextInt();
		
		//Comprobación para saber si acertaste o fallaste
		numRandom = numeroAleatorio(numRandom);
		
		if (entrada==numRandom) {
			System.out.println("Acertaste");
		}else {
			System.out.println("Fallaste, era el " + numRandom);
		}
		

		
		teclado.close();
	}
}
