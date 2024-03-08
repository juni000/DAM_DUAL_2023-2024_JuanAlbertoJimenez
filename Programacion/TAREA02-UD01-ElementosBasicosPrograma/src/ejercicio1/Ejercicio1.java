package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n1=0 , n2=0 ;

		boolean res;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el primer valor:");
		n1 = teclado.nextInt();
		System.out.println("Introduzca el segundo valor:");
		n2 = teclado.nextInt();
		teclado.close();


		System.out.println("\t\t La suma de los dos es: " + (n1 + n2));
		
		System.out.println("\t\t La resta de los dos es: " + (n1 - n2));
		
		System.out.println("\t\t La multiplicación de los dos es: " +  (n1 * n2));
		
		System.out.println("\t\t La división de los dos es: " + ((double)n1/n2));
		
		System.out.println("\t\t La modulo de los dos es: " + (n1%n2));
		
		res = n1 < n2;
		System.out.println("\t\t El primer número es menor que es segundo: " + res);
		
		res = n1 > n2;
		System.out.println("\t\t El primer número es mayor que es segundo: " + res);

		
	}

}
