package ejer3;

import java.util.Scanner;

public class Ejer3 {
	public static int numAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}
	public static void mostrarTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int[][] tabla;
		System.out.println("Introcuzca el número de filas:");
		n = teclado.nextInt();
		tabla = new int[n][];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introcuzca el tamaño de las columnas: ");
			n = teclado.nextInt();
			tabla[i] = new int[n];
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = numAleatorio(1,10);	
			}
		}
		mostrarTabla(tabla);
		teclado.close();
	}

}
