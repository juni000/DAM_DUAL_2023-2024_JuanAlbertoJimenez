package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 0, opcion = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println(" Introduce una opción:" + "\n 1) Ordenar 3 numeros. \n 2 )Salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el número 1 = ");
				n1 = teclado.nextInt();
				System.out.println("Introduzca el número 2 = ");
				n2 = teclado.nextInt();
				System.out.println("Introduzca el número 3 = ");
				n3 = teclado.nextInt();

				if ((n1 >= n2) && (n1 >= n3)) {
					if (n2 >= n3) {
						System.out.println("Orden: " + n1 + " >= " + n2 + " >= " + n3);
					} else {
						System.out.println("Orden: " + n1 + " >= " + n3 + " >= " + n2);
					}
				} else if ((n2 >= n1) && (n2 >= n3)) {
					if (n1 >= n3) {
						System.out.println("Orden: " + n2 + " >= " + n1 + " >= " + n3);
					} else {
						System.out.println("Orden: " + n2 + " >= " + n3 + " >= " + n1);
					}

				} else {
					if (n1 >= n2) {
						System.out.println("Orden: " + n3 + " >= " + n1 + " >= " + n2);
					} else {
						System.out.println("Orden: " + n3 + " >= " + n2 + " >= " + n1);
					}
				}
				break;
			case 2:
				break;
			default:
				System.out.println("Opcion invalida.");
				break;
			}
		} while (opcion != 2);
		System.out.println("Bye");
		teclado.close();
	}

}
