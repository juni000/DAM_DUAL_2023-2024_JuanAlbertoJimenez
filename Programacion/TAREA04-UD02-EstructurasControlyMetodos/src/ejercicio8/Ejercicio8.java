package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static int fibo(int a) {
		if (a > 1) {
			return fibo(a - 1) + fibo(a - 2);
		} else if (a == 1) {
			return 1;
		} else if (a == 0) {
			return 0;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// Calcular los n primeros términos de la sucesión de Fibonacci. El valor de n,
		// se leerá por teclado en un bucle que finaliza si se introduce un número
		// negativo.
		int n = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("\nIntroduce número entero(negativo para salir)");
			n = teclado.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print(fibo(i) + " ");
			}
		} while (n > 0);
		teclado.close();
		
		
		/*int n = 0, a = 0, b = 1;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("\n Introduca un número entero (negativo para salir)");
			n = teclado.nextInt();
			if (n > 0) {
				System.out.println("Los primeros " + n + " números de la serie de Fibonacci son");
				a = 0;
				b = 1;
				System.out.print(a + " ");
				for (int i = 0; i < n - 1; i++) {
					a = b + a;
					System.out.print(a + " ");
					b = a - b;
				}
			}
		} while (n > 0);

		System.out.println("Bye");
		teclado.close();*/
		
	}

}
