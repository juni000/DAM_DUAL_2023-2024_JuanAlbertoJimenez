package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(
				"Programa que lee dos números por teclado, los resta, y comprueba si el resultado de la resta es un número negativo.\nSi es así, el programa finaliza, en caso contrario, pide un número de nuevo y lo resta al resultado anterior,\ny así sucesivamente hasta que el resultado de la resta sea un número negativo. ");
		System.out.println("Introduzca un número: ");
		n1 = teclado.nextInt();
		System.out.println("Introduzca el número que se va a restar: ");
		n2 = teclado.nextInt();
		
		while (n1 - n2 > -1) {
			System.out.println("El resultado de " + n1 + " menos " + n2 + " es: " + (n1 - n2));
			n1 = n1 - n2;
			System.out.println("Introduzca un nuevo número: ");
			n2 = teclado.nextInt();
		}
		System.out.println("El resultado de " + n1 + " menos " + n2 + " es: " + (n1 - n2)
				+ " como es negativo se acaba el programa.");
		teclado.close();
	}

}
