package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static String calcularMes(int mes) {
		String textomes = "";

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
			textomes = "mes invalido";
		}
		return(textomes);
	}
	
	public static void calcularHora(int hora) {

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
	}
	
	public static void parImpar(int n) {		
		if (n%2 == 0)
			System.out.println("Es par");
			else System.out.println("Es impar");
	}

	public static void main(String[] args) {
		int opcion = 0, numero=0;
		
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("\t\t Menú de operaciones");
			System.out.println("\t\t 1) Calcular hora \n \t\t 2) Calcular mes \n\t\t 3) Par o impar" + "\n\t\t 4) Salir");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Llamar  calcular hora");
				System.out.println("Introduzca la hora del 0-24 :");
				numero = teclado.nextInt();
				calcularHora(numero);
				break;
				
			case 2:
				System.out.println("Llamar calcular mes");
				System.out.println("Introduzca el mes del 1-12 :");
				numero = teclado.nextInt();
				System.out.println("Es el mes de " + calcularMes(numero));
				break;
				
			case 3:
				System.out.println("Llamar Par o impar");
				System.out.println("Introduzca un número:");
				numero = teclado.nextInt();
				parImpar(numero);
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (opcion != 4);
		System.out.println("Bye");
		teclado.close();

	}

}
