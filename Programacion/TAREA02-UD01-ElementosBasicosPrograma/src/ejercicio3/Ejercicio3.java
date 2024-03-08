package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	final static double PI = 3.141592;

	public static void main(String[] args) {
		int radio=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el radio de la circunferencia:");
		radio = teclado.nextInt();
		teclado.close();

		System.out.println("El prerímetro de la circunferencia es: " + (float)(radio*2*PI));
		
		System.out.println("El área de la circunferencia es: " + (float)(radio*radio*PI));


	}

}
