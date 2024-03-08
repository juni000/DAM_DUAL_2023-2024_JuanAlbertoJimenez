package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int hora = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca la hora del 0-24 :");
		hora = teclado.nextInt();
		teclado.close();

		if (hora >= 0 && hora <= 12) {
			System.out.println("Buenos días");
		} 
		
		else if (hora > 12 && hora < 21) {
			System.out.println("Buenas tardes");
		}

		else if (hora >= 21 && hora <= 24) {
			System.out.println("Buenas noches");
		}

		else {
			System.out.println("Hora inválida");
		}

		System.out.println("Bye");

	}

}
