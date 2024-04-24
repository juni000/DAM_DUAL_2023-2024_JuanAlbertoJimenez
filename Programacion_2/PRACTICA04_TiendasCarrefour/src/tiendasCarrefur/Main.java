package tiendasCarrefur;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static int leerOpcionValida(Scanner sc) {
		 int entero = 0;
		 boolean salir = true;
		 do {
			 try {
			  entero = sc.nextInt();
			 } catch (InputMismatchException ex) {
				 System.out.println("Carácter no entero!!!");
				 sc.next();
				 salir  = false; 
			 }
		 } while(!salir);
			 		 
		 return entero;
	}
	public static void altaTienda(Tienda tienda) {
		tienda.empleadosSeccion();
		if (tienda instanceof  Hipermercado) {
			if (((Hipermercado) tienda).empleados / ((Hipermercado) tienda).seccionesH < 10) {
				System.out.println("Es necesario más empleados en esta tienda, vamos a aumentarlos.");
				((Hipermercado) tienda).empleados = ((Hipermercado) tienda).empleados +10;
				tienda.empleadosSeccion();
			}
		}else if (tienda instanceof  Supermercado) {
			if (((Supermercado) tienda).empleados /((Supermercado) tienda).seccionesS < 10) {
				System.out.println("Es necesario más empleados en esta tienda, vamos a aumentarlos.");
				((Supermercado) tienda).empleados = ((Supermercado) tienda).empleados +10;
				tienda.empleadosSeccion();
			}
		}else if (tienda instanceof  City) {
			if (((City) tienda).empleados /((City) tienda).seccionesC < 10) {
				System.out.println("Es necesario más empleados en esta tienda, vamos a aumentarlos.");
				((City) tienda).empleados = ((City) tienda).empleados +10;
				tienda.empleadosSeccion();
			}
		}
	}
	
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int opcion = 0 , secciones = 0;
			boolean salir = false;


			ArrayList<Tienda> tiendas = new ArrayList<Tienda>();

			do {
				System.out.println("\n\t\tElige la opción del menú."
	                    + "\n\t\t1) Hipermercado"
	                    + "\n\t\t2) Supermercado"
	                    + "\n\t\t3) CiTy");
		
				opcion = leerOpcionValida(teclado);
				
				switch(opcion) {
				case 1:
					System.out.println("Introduzca el numeor de secciones: ");
					secciones = teclado.nextInt();
					tiendas.add(new Hipermercado(secciones));
					altaTienda(tiendas.get(Tienda.numTiendas- 1));
					break;
				case 2:
					System.out.println("Introduzca el numeor de secciones: ");
					secciones = teclado.nextInt();
					tiendas.add(new Supermercado(secciones));
					altaTienda(tiendas.get(Tienda.numTiendas- 1));
					break;				
				case 3:
					System.out.println("Introduzca el numeor de secciones: ");
					secciones = teclado.nextInt();
					tiendas.add(new City(secciones));
					altaTienda(tiendas.get(Tienda.numTiendas- 1));
					break;
				
				}
			} while(opcion == 1 || opcion == 2 || opcion == 3);
			System.out.println("Número de tiendas creadas: " + Tienda.numTiendas);
			teclado.close();
		
	}
	
	
}
