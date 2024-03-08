package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    /* Hacer un programa que pida un texto por pantalla, 
     * pida una letra por pantalla (que exista dentro del texto anterior), 
     * y pida otra letra por pantalla. 
     * Con todos esos datos, el programa debe sustituir todas las veces 
     * donde aparezca la primera letra, por la segunda. 
     * Mostrar el texto modificado por pantalla. 
     * 
     */
	
	public static boolean existeLetra(char car, String texto) {
		boolean existe = false;
		for (int i=0; i<texto.length(); i++)
			if (car == texto.charAt(i)) existe = true;
		return existe;
	}
	
	public static boolean existeLetraPlus(char car, String texto) {
		boolean existe = false;
		if (texto.indexOf(car) != -1) existe = true;		
		return existe;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		char letraExistente, letraNueva;
		
		System.out.println("Por favor, introduce un texto: ");
		frase = sc.nextLine();
		
		do {
		 //Pedir una letra por pantalla (que exista dentro del texto anterior)
		 System.out.println("Por favor, introduce una letra del texto anterior: ");
		 letraExistente = sc.nextLine().charAt(0);
		} while(!existeLetraPlus(letraExistente, frase));
		
		//Pedir otra letra por pantalla 
		System.out.println("Por favor, introduce otra letra cualquiera: ");
		letraNueva = sc.nextLine().charAt(0);
		
		// sustituir todas las veces donde aparezca la primera letra, por la segunda. 
	    frase = frase.replace(letraExistente, letraNueva);
	    
	    // Mostrar el texto modificado por pantalla. 
		System.out.println("Texto modificado: " + frase);
		sc.close();
		System.out.println("Bye.");
	}

}
