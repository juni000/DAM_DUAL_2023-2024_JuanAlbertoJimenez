package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		String[] nombreArray;
		System.out.println("Introduce Nombre y Apellidos: ");
		cadena = teclado.nextLine();
		nombreArray = cadena.split(" ");
		System.out.println(nombreArray[1] + " " + nombreArray[2] + " " + nombreArray[0]);
		teclado.close();
	}

}
