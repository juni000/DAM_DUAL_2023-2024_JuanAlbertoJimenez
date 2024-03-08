package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int l = 0, a = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el lado: ");
		l = teclado.nextInt();
		System.out.println("Introduzca el ancho: ");
		a = teclado.nextInt();


		for (int j = 0; j < l; j++) {
			for (int i = 0; i < a; i++) {
				if (i == 0 || i == l-1 || j == 0 || j == a - 1) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
		teclado.close();
	}

}
