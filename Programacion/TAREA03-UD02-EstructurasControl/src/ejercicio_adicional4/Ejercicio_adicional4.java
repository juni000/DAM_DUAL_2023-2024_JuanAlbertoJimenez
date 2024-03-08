package ejercicio_adicional4;

import java.util.Scanner;

public class Ejercicio_adicional4 {

	public static void main(String[] args) {
		// Programa que mediante el bucle FOR, para un número entero solicitado al
		// usuario, num,
		// devuelva los primeros num números de la serie de Fibonacci.
		
		int n = 0, a = 0, b = 1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca número: ");
		n = teclado.nextInt();
		teclado.close();
		
		if (n != 0) {
			b = n;
		}

		System.out.println("Los primeros números de la serie de Fibonacci de tu número.");
		System.out.print(n + " " + n + " ");
		for (a = 0; a < 10; a++) {
			n = b + n;
			System.out.print(n + " ");
			b = n - b;

		}
	}

}
