package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n = 0;
		Scanner teclado = new Scanner(System.in);
		

		System.out.println("Introduzca un número:");
		n = teclado.nextInt();
		teclado.close();
		
		if (n%2 == 0)
			System.out.println("Es par");
			else System.out.println("Es impar");

		System.out.println("Bye");
	}

}
