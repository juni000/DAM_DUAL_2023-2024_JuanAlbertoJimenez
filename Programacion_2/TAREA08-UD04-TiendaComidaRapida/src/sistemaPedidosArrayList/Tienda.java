package sistemaPedidosArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {
	
	public static int leerOpcionValida(Scanner sc, int ini, int fin) {
		 int entero = 0;
		 boolean salir = false;
		 do {
			 System.out.println("Introduce un número entre " + ini + " y " + fin + ":");
			 try {
			  entero = sc.nextInt();
		      if (entero > fin || entero < ini) 
		    	 System.out.println("Opción incorrecta.");
		      else 
		    	 salir = true;
			 } catch (InputMismatchException ex) {
				 System.out.println("Carácter no entero!!!");
				 sc.next();
			 }
		 } while(!salir);
			 		 
		 return entero;
	}

	public static void main(String[] args) {
		// Variables
		Scanner teclado = new Scanner(System.in);
		String hola = "hola";
		hola.charAt(90);
		int opcion = 0;
		int numeroIngredientesAdicionales = 0;
		boolean salir = false;
		int ganancias = 0;
		// Declarar y crear los arraylist's:
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

		
		System.out.println("Arrancamos el sistema.");
		System.out.println("Pedidos de Hamburguesa: " + Hamburguesa.numeroPedidos);
		System.out.println("Pedidos de Pizza: " + Pizza.numeroPedidos);
		System.out.println("Pedidos de Kebab: " + Kebab.numeroPedidos);

		do {
			System.out.println("\n\t\tElige la opción del menú."
                    + "\n\t\t1) Encargar Hamburguesa"
                    + "\n\t\t2) Encargar Pizza"
                    + "\n\t\t3) Encargar Kebab"
                    + "\n\t\t4) Resumen de Pedidos"
                    + "\n\t\t5) Finalizar");
	
			opcion = leerOpcionValida(teclado, 1, 5);
			
			switch(opcion) {
			case 1:
				System.out.println("\t\t*** PEDIDO DE HAMBURGUESA ***");
				System.out.println("Elige el número de ingredientes extra para hamburguesa:");
				numeroIngredientesAdicionales = leerOpcionValida(teclado, 0,  5);
				pedidos.add(new Hamburguesa(numeroIngredientesAdicionales));
				((Imprimible) (pedidos.get(Hamburguesa.numeroPedidos-1))).mostrarPedido();				
				break;
			case 2:
				System.out.println("\t\t*** PEDIDO DE PIZZA ***");
				System.out.println("Elige el número de ingredientes extra para pizza:");
				numeroIngredientesAdicionales = leerOpcionValida(teclado, 0,  5);	
				pedidos.add(new Pizza(numeroIngredientesAdicionales));
				((Imprimible) (pedidos.get(Pizza.numeroPedidos-1))).mostrarPedido();				
				break;				
			case 3:
				System.out.println("\t\t*** PEDIDO DE KEBAB ***");
				System.out.println("Elige el número de ingredientes extra para kebab:");
				numeroIngredientesAdicionales = leerOpcionValida(teclado, 0,  5);	
				pedidos.add(new Kebab(numeroIngredientesAdicionales));
				((Imprimible) (pedidos.get(Kebab.numeroPedidos-1))).mostrarPedido();				
				break;
			case 4:
				System.out.println("\t\t*** RESUMEN DE PEDIDOS ***");
				for (Pedido ham :pedidos)
					((Imprimible) (ham)).mostrarPedido();
				for (Pedido piz :pedidos)
					((Imprimible) (piz)).mostrarPedido();
				for (Pedido keb :pedidos)
					((Imprimible) (keb)).mostrarPedido();
				break;
			case 5:
				salir = true;
				System.out.println("\t\t*** GANANCIA TOTAL DE PEDIDOS ***");
				for (Pedido ham :pedidos)
					ganancias += ham.precioComida();				
				for (Pedido piz :pedidos)
					ganancias += piz.precioComida();
				for (Pedido keb :pedidos)
					ganancias += keb.precioComida();
				System.out.println("\t\t" + ganancias + " EUROS");
				
				break;
			}
		} while(!salir);

		teclado.close();
		System.out.println("Bye.");
	}

}
