package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int a = 0, hora = 0, mes = 0, n = 0;
		
		String textomes = "";
		Scanner teclado = new Scanner(System.in);


		do {
			System.out.println("Elige entre las diferentes opciones: ");
			System.out.println("1) Calculo Hora\r\n" + "2) Calculo Mes\r\n" + "3) Par o Impar\r\n" + "4) Salir");
			a = teclado.nextInt();
			switch (a) {
			case 1:
					System.out.println("Introduzca la hora del 0-24 :");
					hora = teclado.nextInt();
					if (hora >= 0 && hora <= 12) {
						System.out.println("Buenos días");

					}

					else if (hora > 12 && hora < 21) {
						System.out.println("Buenas tardes");

					}

					else if (hora >= 21 && hora <= 24) {
						System.out.println("Buenas noches");

					}

					else {
						System.out.println("Hora inválida");
				}
				break;
			case 2:
				System.out.println("Introduzca el mes del 1-12 :");
				mes = teclado.nextInt();
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

				}
				System.out.println("Es el mes de " + textomes);

				break;
			case 3:
				System.out.println("Introduzca un número:");
				n = teclado.nextInt();

				if (n % 2 == 0)
					System.out.println("Es par");
				else
					System.out.println("Es impar");

				break;
			case 4:

				break;

			default:
				System.out.println("Error en la elección");
				break;
			}
			
		} while (a != 4);

		teclado.close();
		System.out.println("Bye");
	}

}
