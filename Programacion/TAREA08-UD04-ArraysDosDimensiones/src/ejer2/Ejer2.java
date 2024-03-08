package ejer2;

import java.util.Scanner;

public class Ejer2 {
	public static int numAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int[][] tabla;
		System.out.println("Introcuzca el tamaño de las columnos:");
		n = teclado.nextInt();
		tabla = new int[5][n];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = numAleatorio(1,10);				
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.println(tabla[i][j] + " ");				
			}
			System.out.println();
		}
		teclado.close();
	}

}
