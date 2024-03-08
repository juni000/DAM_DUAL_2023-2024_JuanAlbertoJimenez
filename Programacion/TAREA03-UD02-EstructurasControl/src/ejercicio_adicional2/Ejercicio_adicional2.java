package ejercicio_adicional2;

import java.util.Scanner;

public class Ejercicio_adicional2 {

	public static void main(String[] args) {
		// Programa para determinar el número mayor entre dos números
		int a = 0, b = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el número 'a': ");
		a = teclado.nextInt();
		System.out.println("Introduzca el número 'b': ");
		b = teclado.nextInt();
		teclado.close();

		if (a > b) {
			System.out.println("el numero 'a' = " + a + " es mayor que el numero 'b' = " + b);
		} else if (b > a) {
			System.out.println("el numero 'b' = " + b + " es mayor que el numero 'a' = " + b);
		} else if (b == a) {
			System.out.println("'a' y 'b' son iguales " + b + " = " + a);
		} else {
			System.out.println("Números invalidos");
		}

	}

}
