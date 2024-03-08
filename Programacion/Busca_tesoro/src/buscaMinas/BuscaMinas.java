package buscaMinas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscaMinas {
	public static int numAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

	public static int invertirValor(int y) {
		int[] array = { 0, 1, 2, 3 };
		y = array[array.length - y - 1];
		return y;
	}

	public static int leerOpcionValida(int min, int max, Scanner teclado) {
		int opcion = 0;
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

	public static void rellenarArray(int[][] tabla, int dificultad) {
		int  x = 0, y = 0;
		boolean repetido = false;
		// comprueba si la casilla donde esta la bomba o el tesoro ya tiene algo, si
		// tiene algo lo vuelve a generar hasta no tener nada
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 0;
			}
		}
		for (int i = 0; i < dificultad; i++) {
			do {
				repetido = false;
				x = numAleatorio(0, 4);
				y = numAleatorio(0, 5);
				if (tabla[x][y] != 3) {
					tabla[x][y] = 3;
				} else {
					repetido = true;
				}
			} while (repetido == true);
		}
		do {
			repetido = false;
			x = numAleatorio(0, 4);
			y = numAleatorio(0, 5);
			if (tabla[x][y] != 3) {
				tabla[x][y] = 4;
			} else {
				repetido = true;
			}
		} while (repetido == true);
	}

	public static boolean comprobacion(int[][] tabla) {
		// este metodo sirve para saber si el jugador ha ganado o perdido, al sumarle 2
		// a 3 o 4 da diferentes resultados.
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] == 5) {
					mostrarArray(tabla, true);
					System.out.println("Has perdido");
					return true;
				}
				if (tabla[i][j] == 6) {
					mostrarArray(tabla, true);
					System.out.println("Has ganado");
					return true;
				}
			}
		}
		return false;
	}

	// Transformo cada valor en un tipo de syso diferente
	public static void mostrarArray(int[][] tabla, boolean fin) {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla.length - i - 1 + "|");
			for (int j = 0; j < tabla[i].length; j++) {
				if (fin == true) {
					if (tabla[i][j] == 3) {
						System.out.print("* ");
					}
					if (tabla[i][j] == 4) {
						System.out.print("$ ");
					}
				} else {
					if (tabla[i][j] == 0 || tabla[i][j] == 3 || tabla[i][j] == 4) {
						System.out.print("  ");
					}
				}
				if (tabla[i][j] == 2) {
					System.out.print("X ");
				}
				if (tabla[i][j] == 5) {
					System.out.print("* ");
				}
				if (tabla[i][j] == 6) {
					System.out.print("$ ");
				}

			}
			System.out.println();
		}
		System.out.println("  ----------");
		System.out.println("  0 1 2 3 4");
	}

	public static void main(String[] args) {
		boolean salir = false;
		int x = 0, y = 0, dificultad = 0, sal = 0;
		Scanner teclado = new Scanner(System.in);
		int[][] tabla = new int[4][5];
		do {
			System.out.println("Elige dificultad: ");
			dificultad = leerOpcionValida(1, 19, teclado);
			rellenarArray(tabla, dificultad);
			do {
				mostrarArray(tabla, false);
				do {
					System.out.println("Coordenada x:");
					x = leerOpcionValida(0, 4, teclado);
					System.out.println("Coordenada y:");
					y = leerOpcionValida(0, 3, teclado);
					// el valor "y" tiene que ser el inverso al que se introduce, para ello con un
					// array de 0,1,2,3 le resto el valor "y" a arra.lengt-1 para que me de el valor
					// inverso
					y = invertirValor(y);
					if (tabla[y][x] == 2) {
						System.out.println("Casilla ya seleccionada intentalo de nuevo");
					}
				} while (tabla[y][x] == 2);
				// Porque 2, porque hay otros dos posibilidades o que caiga en tesoro 3 o en
				// bomba 4, si llega aser 1 y le sumo 1 a 3 valdria 4 que es bomba.
				tabla[y][x] += 2;
				salir = comprobacion(tabla);
			} while (salir == false);
			System.out.println("¿Quieres Juagar de nuevo?" + "\n0) Sí 1) No");
			sal = leerOpcionValida(0, 1, teclado);
		} while (sal == 0);
		teclado.close();
	}

}
