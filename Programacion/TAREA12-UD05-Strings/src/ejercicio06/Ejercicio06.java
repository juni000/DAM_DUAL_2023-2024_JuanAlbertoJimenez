package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
    /* Al Ejercicio anterior, añadir que antes de mostrar 
     * el resultado por pantalla, transforme la primera letra 
     * del Nombre y de los apellidos, a Mayúsculas.
     */
	
	public static String transformar (String cadena) {
		// Pasar el primer carácter a Mayúsculas
				
		/* Estrategia  (Roberto)
		 *   Usar el método replaceFirst --> primera letra con su mayúscula
		 *   Usamos el método replaceFirst que tiene dos parámetros String
		 *   Queremos pasar carácter a String --> Character.toString(algo.charAt(x))
		 *   
		 *   Para pasar un carácter a mayúsculas --> lo pasamos a string y luego a mayúsculas
		 *   
		 */
		
		//return cadena.replaceFirst(Character.toString(cadena.charAt(0)), 
		//		(Character.toString(cadena.charAt(0))).toUpperCase());
			
		String cadenaRetorno, param1, param2;
		char car;
		car = cadena.charAt(0);
		param1 = Character.toString(car);
		param2 = param1.toUpperCase();
		cadenaRetorno = cadena.replaceFirst(param1, param2);
		return cadenaRetorno;
		
	}
	
	public static String transformarPlus(String cadena) {
		return cadena.substring(0,1).toUpperCase() + cadena.substring(1);
	}
	
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
		
		System.out.println(transformarPlus(apellido1) + " " + transformarPlus(apellido2) 
			+ " " + transformarPlus(nombre));
		sc.close();
		System.out.println("Bye.");	
	}

}
