package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	/*
	 * Hacer un programa que pida al usuario que introduzca 
	 * una frase por pantalla, y muestre por pantalla cuántas vocales 
	 * hay en el texto.
	 */
	
	
	public static boolean esVocal(char car) {
		// Método esVocal: un carácter es una vocal si 
		//      es 'a', 'e', 'i', 'o', 'u'
		if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u' )
			return true;
		else
			return false;
	}
	
	public static boolean esVocalPlus(char car) {
	   char[] esVocalPlus = {'a', 'e', 'i', 'o', 'u'};	
	   boolean esVocal = false;
	   for (int i=0; i<esVocalPlus.length; i++)
		   if (car == esVocalPlus[i]) esVocal = true;
	   return esVocal;
	}
	
	public static void main (String[] args) {
		/*
		 * Pasos: 
		 * 1.- Leer un string de pantalla 
		 * 2.- Recorremos el string y 
		 * 3.- Para cada letra o carácter preguntamos si es vocal
		 * 4.- Si es vocal incrementamos un contadores de vocales
		 * 5.- Método esVocal: un carácter es una vocal si 
		 *       es 'a', 'e', 'i', 'o,' 'u'
		 */
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		int numeroVocales = 0;
	
		// Leer un string de pantalla
		System.out.println("Por favor, introduce un string: ");
		cadena = sc.nextLine();
		// Pasamos a minúsculas toda la cadena
		cadena = cadena.toLowerCase();
		// Recorremos el string
		for (int i=0; i<cadena.length(); i++) {
			// Para cada letra o carácter preguntamos si es vocal
			if (esVocalPlus(cadena.charAt(i))) {
				// Si es vocal incrementamos un contadores de vocales
				numeroVocales++;
			}
		}
			
		System.out.println("El número de vocales es: " + numeroVocales);
		sc.close();
		System.out.println("Bye.");
	}
}
