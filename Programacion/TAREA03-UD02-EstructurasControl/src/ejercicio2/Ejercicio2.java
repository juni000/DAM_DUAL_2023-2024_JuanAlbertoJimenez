package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int mes = 0;
		String textomes = "";
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el mes del 1-12 :");
		mes = teclado.nextInt();
		teclado.close();

		switch (mes) {
		case 1:
			textomes = "enero";
			break;
		case 2:
			textomes = "febrero";
			break;
		case 3:
			textomes = "marzo";
			break;
		case 4:
			textomes = "abril";
			break;
		case 5:
			textomes = "mayo";
			break;
		case 6:
			textomes = "junio";
			break;
		case 7:
			textomes = "julio";
			break;
		case 8:
			textomes = "agosto";
			break;
		case 9:
			textomes = "septiembre";
			break;
		case 10:
			textomes = "octubre";
			break;
		case 11:
			textomes = "noviembre";
			break;
		case 12:
			textomes = "diciembre";
			break;
		default:
			textomes = "invalido";
			System.out.println("Mes inválido");
		}
		if (textomes != "invalido") {
			System.out.println("Es el mes de " + textomes);
		}
		System.out.println("Bye");

	}
}
