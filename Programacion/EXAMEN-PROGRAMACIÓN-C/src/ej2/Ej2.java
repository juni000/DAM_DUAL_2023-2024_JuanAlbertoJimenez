package ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	public static int leerOpcionValida(int min, int max, Scanner teclado) {
		int opcion = 0;
		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Caracter incorrecto.");
			teclado.next();
		}
		while (opcion < min || opcion > max) {
			System.out.println("Opción fuera de rango, introduce otra opción");
			try {
				opcion = teclado.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Caracter incorrecto.");
				teclado.next();
			}
		}
		return opcion;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int posicion = 0;
		String[] cadenaArray; 
		System.out.println("Introduce la cadena de caracteres: ");
		cadena = teclado.nextLine();
		System.out.println("Introduce la posición de la letra que quieres pasar a mayúsculas:");
		posicion = leerOpcionValida(0,cadena.length(),teclado);
		cadenaArray = cadena.split("");
		cadenaArray[posicion] = cadenaArray[posicion].toUpperCase();
		
		System.out.println("La cadena original es: " + cadena);
		System.out.print("La cadena cambiada es: ");
		for (int i = 0; i < cadenaArray.length; i++) {
			System.out.print(cadenaArray[i]);
		}
		teclado.close();
	}

}
