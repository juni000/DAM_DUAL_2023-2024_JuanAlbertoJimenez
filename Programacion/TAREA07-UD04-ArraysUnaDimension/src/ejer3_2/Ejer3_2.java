package ejer3_2;

import java.util.Scanner;

public class Ejer3_2 {

	public static int numAleatorio(int min,int max) {
		return (int) (Math.random() * max + min);
	}

	public static boolean esPrimo(int n) {
		if (n == 1 || n == 0 || n == 4) {
			return false;
		}
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				return false;
			} 
		}
		return true;
	}

	public static void rellenarArray(int[] lista) {
		//Paso 5 generar número aleatorio
		int n = numAleatorio(1,100);
		for (int i = 0; i < lista.length; i++) {
			//Paso 6 preguntar si es primo
			//Paso 7 si es primo se le asigna al array
			if (esPrimo(n) == true) {
				lista[i] = n;
				n = numAleatorio(1,100);
			//Paso 7 si no es primo se genera otro numero y se vuelve al paso 6
			} else if (esPrimo(n) == false) {
				i--;
				n = numAleatorio(1,100);
			}
		}
	}

	public static void mostrarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
		}
	}
	

	public static int numMayor(int[] lista) {
		int n = 0;
		//Paso 9 recorrer el array y guardar el mayor valor en una variable temporal
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > n) {
				n = lista[i];
			}
		}
		return n;
	}

	public static void main(String[] args) {
		//Paso 1 declarar array y variables
		Scanner teclado = new Scanner(System.in);
		int tamano = 0;
		//Paso 2 preguntar tamaño
		System.out.println("Introduzca el tamaño del array: ");
		tamano = teclado.nextInt();
		//Paso 3 crear array
		int[] lista = new int[tamano];
		//Paso 4 rellenar array
		rellenarArray(lista);
		//Paso 8 Mostrar array
		mostrarArray(lista);
		//Paso 10 mostrar el número mayor
		System.out.println("\nEl mayor nùmero es: " + numMayor(lista));
		
		teclado.close();
	}

}
