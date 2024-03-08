package ejer2;

import java.util.Scanner;

public class Ejer2 {
	public static int generadorAleatorio() {
		return (int) (Math.random()*10);
	}
	
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = generadorAleatorio();
		}
	}
	public static void llamarArray(int[] lista) {
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
			suma = suma + lista[i];
		}
		System.out.println("La suma es: " + suma);
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño = 0;
		System.out.println("Introduzca el tamaño del array: ");
		tamaño = teclado.nextInt();
		int[] lista = new int[tamaño];
		rellenarArray(lista);
		llamarArray(lista);
		teclado.close();
		
	}
}

