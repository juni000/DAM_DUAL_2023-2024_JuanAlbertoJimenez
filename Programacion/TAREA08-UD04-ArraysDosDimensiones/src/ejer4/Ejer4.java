package ejer4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer4 {
	public static int numAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

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

	public static void mostrarTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sumarFila(int[] tabla) {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];

		}
		return suma;
	}

	public static int sumarColumna(int[][] tabla, int columna) {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i][columna];

		}
		return suma;
	}

	public static int sumarDiagonalPrincipal(int[][] tabla) {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i][i];

		}
		return suma;
	}

	public static int sumarDiagonalInversa(int[][] tabla) {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i][tabla[i].length - 1 - i];

		}
		return suma;
	}

	public static double mediaMatriz(int[][] tabla) {
		int suma = 0, numdatos=0;
		double media = 0.0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				suma += tabla[i][j];
				numdatos++;
			}
		}
		media = (double)suma / numdatos;
		return media;
	}

	public static void rellenarTabla(int[][] tabla, Scanner teclado) {
		System.out.println("\t\tMétodo Rellenar Matriz");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				//System.out.println("Introduce el elemento [" + i + "][" + j + "]");
				// tabla[i][j] = teclado.nextInt();
				tabla[i][j] = numAleatorio(1, 10);
			}
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0, fila = 0, columna = 0;
		boolean relleno = false;
		int[][] tabla = new int[4][4];
		do {
			System.out.println("\n\t\tElige la opción del menú." + "\n\t\t1) Rellenar la matriz de números"
					+ "\n\t\t2) Suma de una fila" + "\n\t\t3) Suma de una columna"
					+ "\n\t\t4) Sumar la diagonal principal " + "\n\t\t5) Sumar la diagonal inversa"
					+ "\n\t\t6) La media de todos los valores de la matriz" + "\n\t\t7) Salir");
			opcion = leerOpcionValida(1, 7, teclado);
			switch (opcion) {
			case 1:
				rellenarTabla(tabla, teclado);
				mostrarTabla(tabla);
				relleno = true;
				break;
			case 2:
				if (relleno == true) {
					System.out.println("Introduce el número de la fila: ");
					fila = leerOpcionValida(0, tabla.length - 1, teclado);
					System.out.println("La suma es: " + sumarFila(tabla[fila]));
				} else {
					System.out.println("Tienes que rellenar primero la tabla");
				}

				break;
			case 3:
				if (relleno == true) {
					System.out.println("Introduce el número de la columna: ");
					columna = leerOpcionValida(0, tabla.length - 1, teclado);
					System.out.println("La suma es: " + sumarColumna(tabla, columna));
				} else {
					System.out.println("Tienes que rellenar primero la tabla");
				}

				break;
			case 4:
				if (relleno == true) {
					System.out.println("La suma de la diagonal principal es: " + sumarDiagonalPrincipal(tabla));
				} else {
					System.out.println("Tienes que rellenar primero la tabla");
				}
				break;
			case 5:
				if (relleno == true) {
					System.out.println("La suma de la diagonal inversa es: " + sumarDiagonalInversa(tabla));
				} else {
					System.out.println("Tienes que rellenar primero la tabla");
				}
				break;
			case 6:
				if (relleno == true) {
					System.out.println("La media de la matriz es: " + mediaMatriz(tabla));
				} else {
					System.out.println("Tienes que rellenar primero la tabla");
				}
				break;
			default:
				break;
			}
		} while (opcion != 7);
		teclado.close();
	}

}
