package ejer3;

import java.util.Scanner;

public class Ejer3 {
	public static int generadorAleatorio() {
		return (int) (Math.random() * 100 + 1);
	}

	public static int primos() {
		int n = 0;
		n = generadorAleatorio();
		while (n == 1 || n == 0 || n == 4) {
			n = generadorAleatorio();
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				n = generadorAleatorio();
				while (n == 1 || n == 0 || n == 4) {
					n = generadorAleatorio();
				}
				i = 2;
			}
		}
		return (n);
	}

	public static void llamarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (i == lista.length - 1) {
				System.out.print(lista[i] + ".\n");
			} else
				System.out.print(lista[i] + ", ");
		}
	}

	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = primos();
		}
	}

	public static int numeroMayor(int[] lista) {
		int n = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > n) {
				n = lista[i];
			}
		}

		return n;

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño = 0;

		System.out.println("Introduzca el tamaño del array: ");
		tamaño = teclado.nextInt();
		int[] lista = new int[tamaño];

		rellenarArray(lista);
		llamarArray(lista);
		System.out.println("El mayor número es: " + numeroMayor(lista));
		
		teclado.close();
	}

}
