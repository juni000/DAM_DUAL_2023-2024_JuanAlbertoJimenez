package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena, cadenaInv = "";
		System.out.println("Introduce una frase.");
		cadena = teclado.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			cadenaInv = cadenaInv + cadena.charAt(cadena.length() - i - 1);

		}
		System.out.println(cadenaInv);
		teclado.close();
	}

}
