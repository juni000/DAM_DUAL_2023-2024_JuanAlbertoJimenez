/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "sin_titulo.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double area;
		double lado;
		System.out.println("Introduce un lado");
		lado = Double.parseDouble(bufEntrada.readLine());
		area = lado*lado;
		System.out.println("El area es: "+area);
		if (area<=6) {
			System.out.println("El area es menor o igual que 6");
		} else {
			System.out.println("El area es mayor que 6");
		}
	}


}

