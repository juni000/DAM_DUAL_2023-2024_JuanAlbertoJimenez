package ejercico_adicional1;

import java.util.Scanner;

public class Ejercicio_adicional1 {

	public static void main(String[] args) {
		// Programa en Java para determinar si un año es bisiesto.
		int año = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un año y te dire si es bisiesto: ");
		año = teclado.nextInt();
		teclado.close();
		if ((año%4==0) && (año%100 !=0 ) || (año%400==0)) {
			System.out.println("Tu año es bisiesto.");
		} else {
			System.out.println("Tu año no es bisiesto.");
		}
		
	}

}
