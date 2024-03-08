package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    /* Hacer un programa que pida al usuario que introduzca 
     * una frase por pantalla, y muestre por pantalla el mismo texto 
     * pero empezando por la última letra hasta la primera. 
     * Ejemplo: "Hola que tal" --> "lat euq aloH"
     */
	
	public static void main(String[] args) {
	  /* Pasos:
	   *   1.- Leer un string de pantalla
	   *   2.- Recorrer el string al revés
	   *   3.- Guardamos en otro string
	   */
		Scanner sc = new Scanner(System.in);
		String cadenaOriginal, cadenaFinal="";
		
		System.out.println("Por favor, introduce la cadena: ");
		cadenaOriginal = sc.nextLine();
		
		for (int i=cadenaOriginal.length()-1; i>=0 ; i--) {
		  //System.out.println(cadenaFinal);
		  cadenaFinal += cadenaOriginal.charAt(i); 
		}
		
		System.out.println("Cadena final: " + cadenaFinal);
		sc.close();
		System.out.println("Bye.");
		
		
	}

}
