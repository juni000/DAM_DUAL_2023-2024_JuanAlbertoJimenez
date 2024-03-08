package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static int entradaDatos(Scanner sc) {
		int a = 0;
		do {
			System.out.println("Por favor introduzca un número entero comprendido entre 1 y 100");
			a = sc.nextInt();
		} while (a <= 0 || a > 100);
		return (a);
	}

	public static float calculo(int a) {
		int i = 0;
		float suma = 0.0F;
		do {
			suma = suma + 1 / a;
			a--;
			i++;
		} while (a != 0);
		System.out.println("Contabilizados " + i + " términos");
		return (suma);
	}

	public static void main(String[] args) {
		float suma = 0;
		int a = 0;
		Scanner teclado = new Scanner(System.in);

		a = entradaDatos(teclado);

		suma = calculo(a);
		System.out.println("El valor del sumatorio es " + suma);
		System.out.println("Bye");
		teclado.close();

	}

}
