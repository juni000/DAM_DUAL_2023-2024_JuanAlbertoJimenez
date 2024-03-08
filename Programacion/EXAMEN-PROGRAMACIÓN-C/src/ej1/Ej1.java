package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	public static int leerOpcionValida(int min, int max, Scanner teclado) {
		int opcion = 0;
		System.out.println("Introduzca una opcion");
		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Caracter incorrecto.");
			teclado.next();
		}
		while (opcion < min || opcion > max) {
			System.out.println("Opcion incorrecta.");
			System.out.println("Introduzca una opcion valida entre " + min + " y " + max + " : ");
			try {
				opcion = teclado.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Caracter incorrecto.");
				teclado.next();
			}
		}
		return opcion;
	}

	public static int numAleatorio(int min, int max) {
		return (int) (Math.random() * max + min);
	}

	public static void rellenarArray(int[] lista, int min, int max) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = numAleatorio(min, max);
		}
	}

	public static void imprimirArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("}");
	}

	public static int calcularMayor(int[] array) {
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > n) {
				n = array[i];
			}
		}
		return n;
	}

	public static int calcularMenor(int[] lista) {
		int n = lista[0];
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] < n) {
				n = lista[i];
			}
		}
		return n;
	}

	public static int sumarNumeros(int[] lista) {
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			suma += lista[i];
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] array = new int[9];
		int opcion = 0, min = 0, max = 0;
		boolean relleno = false;

		do {
			System.out.println("\n\t\tElige la opción del menú." + "\n\t\t1.-Generar array de manera aleatoria "
					+ "\n\t\t2.-Calcular número mayor del array" + "\n\t\t3.-Calcular número menor del array"
					+ "\n\t\t4.-Sumar todos los números del array" + "\n\t\t5.-Salir\r\n");
			opcion = leerOpcionValida(1, 5, teclado);
			switch (opcion) {
			case 1:
				System.out.println("Introduce el valor mínimo del rango para calcular aleatorios: ");
				min = teclado.nextInt();
				System.out.println("Introduce el valor máximo del rango para calcular aleatorios:");
				max = teclado.nextInt();
				while (min > max) {
					System.out.println("ERROR: El mínimo es mayor que el máximo. Inténtalo de nuevo!!!");
					max = teclado.nextInt();
				}
				rellenarArray(array, min, max);
				relleno = true;
				break;
			case 2:
				if (relleno == true) {
					System.out.print("El número mayor del array ");
					imprimirArray(array);
					System.out.print(" es: " + calcularMayor(array));

				} else {
					System.out.println("ERROR: No has rellenado el array!!");
				}
				break;
			case 3:
				if (relleno == true) {
					System.out.print("El número menor del array ");
					imprimirArray(array);
					System.out.print(" es: " + calcularMenor(array));
				} else {
					System.out.println("ERROR: No has rellenado el array!!");
				}
				break;
			case 4:
				if (relleno == true) {
					System.out.print("La suma de todo el array ");
					imprimirArray(array);
					System.out.print(" es: " + sumarNumeros(array));
				} else {
					System.out.println("ERROR: No has rellenado el array!!");
				}
				break;
			case 5:

				break;

			default:
				break;
			}

		} while (opcion != 5);
		
		teclado.close();
	}

}
