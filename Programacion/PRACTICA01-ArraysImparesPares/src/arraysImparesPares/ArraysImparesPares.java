package arraysImparesPares;

import java.util.Scanner;

public class ArraysImparesPares {
	public static int numAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

	public static boolean espar(int n) {
		if (n % 2 == 0) {
			return true;
		} else
			return false;
	}
	//4. Rellenar el array de impares.
	public static void rellenarArray(int[] lista, int min, int max, boolean par) {
		int n = numAleatorio(min, max);
		for (int i = 0; i < lista.length; i++) {
			//Llamar al método “esPar” para saber sie s par o no.
			if (espar(n) == par) {
				lista[i] = n;
				n = numAleatorio(min, max);
				//Si no es impar generar un nuevo número y restarle uno al for
			} else {
				i--;
				n = numAleatorio(min, max);
			}
			//Repetir hasta rellenar el Array.
		}
	}
	//Recorrer el array y mostrar digito a digito el array
	public static void mostrarArray(int[] lista) {
		System.out.print("{");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.print("}\n");
	}

	//Para encontrar el número mayor del array de impar se recorre el array y se
	//guarda en una variable temporal si es número es mayor que el anterior.
	public static int numeroMayor(int[] lista) {
		int n = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > n) {
				n = lista[i];
			}
		}
		return n;
	}
	//Para encontrar el número menor del array de impar se recorre el array y se
	//guarda en una variable temporal si es número es más pequeño que el
	//anterior.

	public static int numeroMenor(int[] lista) {
		int n = 99999;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] < n) {
				n = lista[i];
			}
		}
		return n;
	}
	//Para encontrar el máximo común divisor se crea esa variable temporal para
	//no perder uno de los números, y si el módulo de la división es 0 se guarda
	//como resultado si no se sigue probando con el mismo módulo de la división
	//hasta encontrar el MCD.
	public static int maximoComunDivisor(int a, int b) {
		int temporal;
		while (b != 0) {
			temporal = b;
			b = a % b;
			a = temporal;
		}
		return a;
	}

	public static void main(String[] args) {
		//1. Inicio del programa.
		Scanner teclado = new Scanner(System.in);
		int tamano = 0;
		boolean par = true, impar = false;
		//2. Preguntar el tamaño del array.
		System.out.println("Introduzca el tamaño del array: ");
		tamano = teclado.nextInt();
		//3. Crear array con el tamaño introducido por pantalla.
		int[] listaImpar = new int[tamano];
		System.out.println("Tamaño del array de impares: " + tamano);
		//Mostrar el Array de impares por pantalla
		System.out.println("Array de impares: ");
		rellenarArray(listaImpar, 5, 50, impar);
		mostrarArray(listaImpar);
		//Mostrar el tamaño del array de pares que será igual al número menor del array de
		//impares.
		System.out.println("Tamaño del Array de pares: " + numeroMenor(listaImpar));
		//Crear el array de pares igual que se creó el array de impares
		int[] listaPar = new int[numeroMenor(listaImpar)];
		//Mostrar el Array de pares por pantalla
		System.out.println("Array de pares: ");
		rellenarArray(listaPar, 1, numeroMenor(listaImpar), par);
		mostrarArray(listaPar);
		//Mostrar el máximo común divisor del mayor número y el menor número del array de
		//pares.
		System.out.println("Máximo común divisor de " + numeroMayor(listaPar) + " y " + numeroMenor(listaPar) + " es: "
				+ maximoComunDivisor(numeroMayor(listaPar), numeroMenor(listaPar)));
		
		teclado.close();
	}

}
