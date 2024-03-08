package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena, primera = "";
		String[] nombreArray;
		System.out.println("Introduce Nombre y Apellidos: ");
		cadena = teclado.nextLine();
		nombreArray = cadena.split(" ");
		for (int i = 0; i < nombreArray.length; i++) {
			primera += nombreArray[i].charAt(0);
			nombreArray[i] = nombreArray[i].replaceFirst(primera, primera.toUpperCase());
			primera = "";
		}

		System.out.println(nombreArray[1] + " " + nombreArray[2] + " " + nombreArray[0]);
		teclado.close();
	}

}
