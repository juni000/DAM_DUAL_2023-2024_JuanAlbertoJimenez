package ejercico_adicional3;

import java.util.Scanner;

public class Ejercicio_adicional3 {

	public static void main(String[] args) {
		// Programa que al introducir un año y un mes (en números enteros), nos indique
		// el número de días que tiene dicho mes.
		// Se introduce el año porque los bisiestos tienen diferentes días en Febrero.
		int mes = 0, año = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el mes: ");
		mes = teclado.nextInt();
		System.out.println("Introduzca el año: ");
		año = teclado.nextInt();
		teclado.close();
		if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
			switch (mes) {
			case 1:
				System.out.println("Enero tiene 31 días");
				break;
			case 2:
				System.out.println("Febrero tiene 29 días porque es bisiesto");
				break;
			case 3:
				System.out.println("Marzo tiene 31 días");
				break;
			case 4:
				System.out.println("Abril tiene 30 días");
				break;
			case 5:
				System.out.println("Mayo tiene 31 días");
				break;
			case 6:
				System.out.println("Junio tiene 30 días");
				break;
			case 7:
				System.out.println("Julio tiene 31 días");
				break;
			case 8:
				System.out.println("Agosto tiene 31 días");
				break;
			case 9:
				System.out.println("Septiembre tiene 30 días");
				break;
			case 10:
				System.out.println("Octubre tiene 31 días");
				break;
			case 11:
				System.out.println("Noviembre tiene 30 días");
				break;
			case 12:
				System.out.println("Diciembre tiene 31 días");
				break;
			default:
				System.out.println("Mes inválido");
			}
		} else {
			switch (mes) {
			case 1:
				System.out.println("Enero tiene 31 días");
				break;
			case 2:
				System.out.println("Febrero tiene 30 días");
				break;
			case 3:
				System.out.println("Marzo tiene 31 días");
				break;
			case 4:
				System.out.println("Abril tiene 30 días");
				break;
			case 5:
				System.out.println("Mayo tiene 31 días");
				break;
			case 6:
				System.out.println("Junio tiene 30 días");
				break;
			case 7:
				System.out.println("Julio tiene 31 días");
				break;
			case 8:
				System.out.println("Agosto tiene 31 días");
				break;
			case 9:
				System.out.println("Septiembre tiene 30 días");
				break;
			case 10:
				System.out.println("Octubre tiene 31 días");
				break;
			case 11:
				System.out.println("Noviembre tiene 30 días");
				break;
			case 12:
				System.out.println("Diciembre tiene 31 días");
				break;
			default:
				System.out.println("Mes inválido");
			}
		}

	}
}
