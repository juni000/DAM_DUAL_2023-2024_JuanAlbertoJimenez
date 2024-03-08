package ejemplometodos;

import java.util.Scanner;

public class Operaciones {

	public static int sumar(int a, int b) {
		int s = 0;
		s = a + b;
		return s;
	}

	public static int restar(int a, int b) {
		return (a - b);
	}
	public static int multiplicar(int a, int b) {
		return (a * b);
	}
	public static boolean esMayor(int a, int b) {
		if (a > b) return true;
		else return false;
	}
	public static void listar(int a, int b) {
		System.out.println("Número 1 es :" + a + " y número 2 es : " + b);
		return;
	}
	public static void main(String[] args) {
		int opcion = 0;
		int num1 = 0, num2 = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro número");
		num2 = teclado.nextInt();
		
		do {
			System.out.println("\t\t Menú de operaciones");
			System.out.println("\t\t 1) Sumar \n \t\t 2) Retar \n\t\t 3) Multiplicar"
					+ " \n\t\t 4) Determinar cuál es mayor \n\t\t 5) Listar los números \n\t\t 6) Salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Llamar sumar");
				/*
				 * aux = sumar(num1, num2); System.out.println("La suma de " + num1 + " + " +
				 * num2 + " es: " + aux);
				 */
				System.out.println("La suma de " + num1 + " + " + num2 + " es: " + sumar(num1, num2));
				break;
			case 2:
				System.out.println("Llamar restar");
				System.out.println("La resta de " + num1 + " - " + num2 + " es: " + restar(num1, num2));
				break;
			case 3:
				System.out.println("Llamar multiplicar");
				System.out.println("La multiplicación de " + num1 + " + " + num2 + " es: " + multiplicar(num1, num2));
				break;
			case 4:
				System.out.println("Llamar determinar mayor");
				if (esMayor(num1,num2)) System.out.println(num1 +" es mayor que " + num2);
				else System.out.println(num2 +" es mayor o igual que " + num1);
				break;
			case 5:
				System.out.println("Llamar listar");
				listar(num1,num2);
				break;
			case 6:
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (opcion != 6);
		teclado.close();
		System.out.println("bye");
	}

}
