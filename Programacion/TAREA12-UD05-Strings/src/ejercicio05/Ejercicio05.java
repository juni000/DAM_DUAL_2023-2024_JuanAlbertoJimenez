package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	/*
	 * Hacer un programa que pida un nombre completo por pantalla 
	 * (Nombre Apellido Apellido) y lo guarde en una sola variable String. 
	 * Después habrá que trocear el dato, separándolo en 
	 * Nombre, Apellido1, y Apellido2. 
	 * Por último, mostrar por pantalla el nombre ordenado de la siguiente manera: 
	 * Apellido1 Apellido2, Nombre.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombreCompleto;
		String nombre, apellido1, apellido2;
		String[] nombreArray; 
				
		System.out.println("Por favor, introduce Nombre Apellido1 Apellido2:");
		nombreCompleto = sc.nextLine();
		nombreArray = nombreCompleto.split(" ");
		nombre = nombreArray[0];
		apellido1 = nombreArray[1];
		apellido2 = nombreArray[2];
		
		System.out.println(apellido1 + " " + apellido2 + " " + nombre);
		sc.close();
		
		
		System.out.println("Bye.");
	}

}
