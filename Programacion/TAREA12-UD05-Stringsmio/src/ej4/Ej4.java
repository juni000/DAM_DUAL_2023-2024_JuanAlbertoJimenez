package ej4;

import java.util.Scanner;

public class Ej4 {

	public static boolean existeLetra(char c, String s) {
		boolean existe = false;
		for (int i = 0; i < s.length(); i++) {
			if( c == s.charAt(i)){
				existe = true;
			}
		}
		return existe;
	}
	public static boolean existeLetraPlus(char c, String s) {
		boolean existe = false;
		if (s.indexOf(c) != -1) {
			existe = true;
		}
		return existe;
	}


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		char letraExt, letraNew;
		System.out.println("Introduce una frase.");
		cadena = teclado.nextLine();
		
		do {
			System.out.println("Introduce la letra que quieres sustituir: ");
			letraExt = teclado.nextLine().charAt(0);
		} while (!existeLetra(letraExt,cadena));
		System.out.println("Introduce la letra por la que quieres sustituir: ");
		letraNew = teclado.nextLine().charAt(0);
		cadena = cadena.replace(letraExt,letraNew);
		System.out.println(cadena);
		teclado.close();
	}

}
