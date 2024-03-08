package ejer1;

import java.util.Scanner;

public class Ejer1 {
	public static void rellenarArray(int[] lista, Scanner teclado) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = teclado.nextInt();
		}
	}

	public static void llamarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] lista = new int[10];
		
		rellenarArray(lista, teclado);
		
		llamarArray(lista);
		
		teclado.close();

	}
}