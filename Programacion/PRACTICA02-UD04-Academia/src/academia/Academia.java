package academia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Academia {
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
		int opcion = 0, alumnos = 0, pcs = 0, usuariosEliminados = 0;
		boolean salir = false;
		Scanner teclado = new Scanner(System.in);
		ArrayList<Docencia> docencia = new ArrayList<Docencia>();
		ArrayList<Informatica> informatica = new ArrayList<Informatica>();
		do {
			System.out.println("\n\t\t¿Qué tipo de aula quieres crear?" + "\n\t\t1) Docencia" + "\n\t\t2) Informática"
					+ "\n\t\t3) Listar Aulas" + "\n\t\t4) Salir");
			opcion = leerOpcionValida(1, 4, teclado);
			switch (opcion) {
			case 1:
				System.out.println("¿Cuántos alumnos quieres incluir en el aula de Docencia?");
				alumnos = teclado.nextInt();
				docencia.add(new Docencia(alumnos));
				docencia.get(Docencia.numeroAulas - 1).avisoExcesoCapacidad();
				if (docencia.get(Docencia.numeroAulas - 1).limiteCapacidad() == true) {
					System.out.println("Vamos a eliminar usuarios. Usuarios iniciales en Docencia: "
							+ docencia.get(Docencia.numeroAulas - 1).getUsuarios());
				}
				while (docencia.get(Docencia.numeroAulas - 1).limiteCapacidad() == true) {
					docencia.get(Docencia.numeroAulas - 1)
							.setUsuarios(docencia.get(Docencia.numeroAulas - 1).getUsuarios() - 1);
					usuariosEliminados++;
					if (docencia.get(Docencia.numeroAulas - 1).limiteCapacidad() == false) {
						System.out.println("Usuarios finales en Docencia: "
								+ docencia.get(Docencia.numeroAulas - 1).getUsuarios());
					}
				}
				break;
			case 2:
				System.out.println("¿Cuántos alumnos quieres incluir en el aula de Informática?");
				alumnos = teclado.nextInt();
				System.out.println("Introduce el número de PCs para tu aula de Informática \r\n"
						+ "o bien 0 para mantener la cantidad por defecto.");
				pcs = teclado.nextInt();
				if (pcs == 0) {
					informatica.add(new Informatica(alumnos));
				} else {
					informatica.add(new Informatica(alumnos, pcs));
				}
				informatica.get(Informatica.numeroAulas - 1).avisoExcesoCapacidad();
				if (informatica.get(Informatica.numeroAulas - 1).limiteCapacidad() == true) {
					System.out.println("Vamos a eliminar usuarios. Usuarios iniciales en informatica: "
							+ informatica.get(Informatica.numeroAulas - 1).getUsuarios());
				}
				while (informatica.get(Informatica.numeroAulas - 1).limiteCapacidad() == true) {
					informatica.get(Informatica.numeroAulas - 1)
							.setUsuarios(informatica.get(Informatica.numeroAulas - 1).getUsuarios() - 1);
					usuariosEliminados++;
					if (informatica.get(Informatica.numeroAulas - 1).limiteCapacidad() == false) {
						System.out.println("Usuarios finales en informatica: "
								+ informatica.get(Informatica.numeroAulas - 1).getUsuarios());
					}
				}
				break;
			case 3:
				System.out.println("*** Listado de Aulas ***");
				for (Docencia docenci : docencia) {
					docenci.mostrarInformacion();
				}
				for (Informatica informatic : informatica) {
					informatic.mostrarInformacion();
				}
				break;
			case 4:
				salir = true;
				System.out.println(
						"Número de usuarios a realojar en otras aulas: " + usuariosEliminados + "\r\nFin programa.");
				break;

			default:
				break;
			}
		} while (salir == false);
		teclado.close();
	}
}
