package tiendaComidaRapida;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {

	public static int leerOpcionValida(int min, int max, Scanner teclado) {
		int opcion = 0;
		System.out.println("Introduzca una opcion");
		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Caracter incorrecto.");
			teclado.next();
		}
		while (opcion < min || opcion > max) {
			System.out.println("Opcion incorrecta.");
			System.out.println("Introduzca una opcion valida entre " + min + " y " + max + " : ");
			try {
				opcion = teclado.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Caracter incorrecto.");
				teclado.next();
			}
		}
		return opcion;
	}

	public static void main(String[] args) {
		int opcion = 0, ingredientes = 0, ganancias = 0;
		boolean salir = false;
		Scanner teclado = new Scanner(System.in);

		ArrayList<Hamburguesa> hamburguesas = new ArrayList<Hamburguesa>();
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		ArrayList<Kebab> kebabs = new ArrayList<Kebab>();

		System.out.println("Arrancamos el sistema");
		System.out.println("Pedidos de hamburguesa " + Hamburguesa.numeroPedidos);
		System.out.println("Pedidos de pizza " + Pizza.numeroPedidos);
		System.out.println("Pedidos de kebab " + Kebab.numeroPedidos);

		do {
			System.out.println(
					"\n\t\tElige la opción del menú." + "\n\t\t1) Encargar Hamburguesa" + "\n\t\t2) Encargar Pizza"
							+ "\n\t\t3) Encargar Kebab" + "\n\t\t4) Resumen de Pedidos" + "\n\t\t5) Finalizar");
			opcion = leerOpcionValida(1, 5, teclado);
			switch (opcion) {
			case 1:
				System.out.println("Encargar Hamburguesa");
				System.out.println("Elige el número de ingredientes extra para hamburguesa \n\t\t(0 o 5 como máximo)");
				ingredientes = leerOpcionValida(0, 5, teclado);
				hamburguesas.add(new Hamburguesa(ingredientes));
				(hamburguesas.get(Hamburguesa.numeroPedidos)).mostrarPedido();
				break;
			case 2:
				System.out.println("Encargar Pizza");
				System.out.println("Elige el número de ingredientes extra para pizza \n" + "\t\t(0 o 5 como máximo)");
				ingredientes = leerOpcionValida(0, 5, teclado);
				pizzas.add(new Pizza(ingredientes));
				(pizzas.get(Pizza.numeroPedidos)).mostrarPedido();
				break;
			case 3:
				System.out.println("Encargar Kebab");
				System.out.println("Elige el número de ingredientes extra para kebab \n" + "\t\t(0 o 5 como máximo)");
				ingredientes = leerOpcionValida(0, 5, teclado);
				kebabs.add(new Kebab(ingredientes));
				(kebabs.get(Kebab.numeroPedidos)).mostrarPedido();
				break;
			case 4:
				System.out.println("Resumen de Pedidos");
				for (Hamburguesa hamburguesa : hamburguesas) {
					hamburguesa.mostrarPedido();
				}
				for (Pizza pizza : pizzas) {
					pizza.mostrarPedido();
				}
				for (Kebab kebab : kebabs) {
					kebab.mostrarPedido();
				}
				break;
			case 5:
				salir = true;
				System.out.println("Ganancias totales");
				for (Hamburguesa hamburguesa : hamburguesas) {
					ganancias = hamburguesa.precioComida();
				}
				for (Pizza pizza : pizzas) {
					ganancias = pizza.precioComida();
				}
				for (Kebab kebab : kebabs) {
					ganancias = kebab.precioComida();
				}
				System.out.println("\t" + ganancias + " EUROS");
				break;

			default:
				break;
			}
		} while (salir == false);
		teclado.close();
	}

}
