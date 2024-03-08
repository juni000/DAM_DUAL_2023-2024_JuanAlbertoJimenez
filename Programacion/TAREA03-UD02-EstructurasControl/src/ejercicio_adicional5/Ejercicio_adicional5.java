package ejercicio_adicional5;

import java.util.Scanner;

public class Ejercicio_adicional5 {

	public static void main(String[] args) {
		// Programa que mediante el bucle WHILE, para un número entero dado, devuelva su
		// factorial (operación factorial de n o n!).
		double n = 0, b = 1, c = 0; 
		/*La variable es tipo double porque sino solo seria capaz de calcular hasta 20! = 2.432902e+18
		 * ya que los datos de tipo lon solo son capaces de almacenar 9.2233e+18
		 * aun asi solo es capaz de calucular hasta 170! = 7.257e+306 ya que la variable double solo puede
		 * almacenar hasta un poco mas de 1e+308
		 */
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el número: ");
		n = teclado.nextInt();
		teclado.close();
		System.out.println("El factorial de " + n + "! = ");

		while (n > 1) {
			c = n * (n - 1);
			n = n - 2;
			b = c *b;
		}
		System.out.print(b);
	}

}
