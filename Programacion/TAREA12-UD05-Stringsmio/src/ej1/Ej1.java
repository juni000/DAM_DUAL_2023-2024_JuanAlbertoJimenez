package ej1;

import java.util.Scanner;

public class Ej1 {

	public static boolean esVocal(char si) {
		char[] charac = { 'a', 'e', 'i', 'o', 'u' };
		boolean esvocal = false;
		for (int i = 0; i < charac.length; i++) {
			if (si == charac[i]) {
				esvocal = true;
			}

		}
		return esvocal;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vocales = 0;
		String cadena;
		System.out.println("Introduce una frase.");
		cadena = teclado.nextLine();
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (esVocal(cadena.charAt(i))) {
				vocales++;
			}

		}
		System.out.println("Número de voacles: " + vocales);
		teclado.close();
	}

}
