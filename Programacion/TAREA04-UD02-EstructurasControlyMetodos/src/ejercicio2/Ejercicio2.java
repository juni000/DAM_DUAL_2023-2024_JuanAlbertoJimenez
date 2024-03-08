package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int años = 0, sueldo = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca cuantos años lleva en la empresa: ");
		años = teclado.nextInt();
		if ((años >= 0) && (años < 3)) {
			sueldo = (40000 / 100 * 103);
			System.out.println("Tu sueldo es: " + sueldo);
		} else if ((años >= 3) && (años < 5)) {
			sueldo = (40000 / 100 * 105);
			System.out.println("Tu sueldo es: " + sueldo);
		} else if ((años >= 5) && (años <= 10)) {
			sueldo = (40000 / 100 * 107);
			System.out.println("Tu sueldo es: " + sueldo);
		} else if (años > 10) {
			sueldo = (40000 / 100 * 110);
			System.out.println("Tu sueldo es: " + sueldo);
		}else {
			System.out.println("Número invalido");
		}
		
		teclado.close();
	}

}
