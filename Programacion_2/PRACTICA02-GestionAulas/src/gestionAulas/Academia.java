package gestionAulas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Academia {
	public static int usuariosEliminados = 0;
	
	public static int leerOpcionValida(Scanner sc, int ini, int fin) {
		 int opcion = 0;
		 boolean salir = false;
		 do  {
			try {
				opcion = sc.nextInt();
				if (opcion <= fin && opcion >= ini) {
					salir = true;
				}	
				else
					System.out.println("Opción no válida. Introduce otra opción: ");				
			} catch (InputMismatchException ex) {
				System.err.println("ERROR: Ha de introducir un número.");
				sc.next();
			} catch (Exception ex) {
				System.err.println("Error desconocido " + ex.getMessage());
				sc.next();
			}
		 } while(!salir);
		
		 return opcion;
		}
		
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int opcion=0, numAlumnos=0, numpcs=0;
		boolean salir = false;
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		do {
			System.out.println("\n**********************************");
			System.out.println("¿Qué tipo de aula quieres crear?");
			System.out.println("1=Docencia");
			System.out.println("2=Informática");
			System.out.println("3=Listar Aulas");
			System.out.println("4=Salir");	
			opcion = leerOpcionValida(datos, 1, 4);
		
 			switch (opcion) {
			  case 1:
				System.out.println("¿Cuántos alumnos quieres incluir en el aula de Docencia?");
				numAlumnos = datos.nextInt();
				Docencia docencia = new Docencia(numAlumnos);
				aulas.add(docencia);
				if (docencia.limiteCapacidad() == true) {
					docencia.avisoExcesoCapacidad();
					System.out.println("Vamos a eliminar usuarios. Usuarios iniciales en Docencia: "+ docencia.getUsuarios());
					do {
					  docencia.setUsuarios(docencia.getUsuarios()-1);
					  Academia.usuariosEliminados ++;
					} while (docencia.limiteCapacidad() == true);   
					System.out.println("Usuarios finales en Docencia: "+ docencia.getUsuarios());
			    }
				break;
			  case 2:
				System.out.println("¿Cuántos alumnos quieres incluir en el aula de Informática?");
			    numAlumnos = datos.nextInt();
				System.out.println("Introduce el número de PCs para tu aula de Informática \no bien 0 para mantener la cantidad por defecto.");
			    numpcs = datos.nextInt();
			    Informatica informatica;
			    if (numpcs == 0) {
			    	informatica = new Informatica(numAlumnos);
			    }
			    else {
			    	informatica = new Informatica(numAlumnos, numpcs);
			    }
			    aulas.add(informatica);
				if (informatica.limiteCapacidad() == true) {
					informatica.avisoExcesoCapacidad();
					System.out.println("Vamos a eliminar usuarios. Usuarios iniciales en Informática: "+ informatica.getUsuarios());
					do {
					  informatica.setUsuarios(informatica.getUsuarios()-1);
					  Academia.usuariosEliminados ++;
					} while (informatica.limiteCapacidad() == true);   
					System.out.println("Usuarios finales en Informática: "+ informatica.getUsuarios());
			    }
				break;
			  case 3:
				System.out.println("*** Listado de Aulas ***");  
				for (int i=0; i<Docencia.numeroAulas; i++)
					aulas.get(i).imprimirInfo();
				for (int i=0; i<Informatica.numeroAulas; i++)
					aulas.get(i).imprimirInfo();
				break;
			  case 4:
				  salir = true;
				  break;
			  } //switch
			
	     } while (!salir);	
		 System.out.println("Número de usuarios a realojar en otras aulas: "
			+ Academia.usuariosEliminados);
		 
		 datos.close();
		 System.out.println("Fin programa.");
	 } //main

}
