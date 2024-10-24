package clase_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el nombre del fichero: ");
		String cadena = teclado.nextLine();
		File fich = new File("E:\\Juan_Hijo\\DAM_1\\Acceso_Datos\\Files\\" + cadena + ".txt");
		fich.createNewFile();
		FileWriter fw = new FileWriter(fich,true);

		System.out.println("Introduce tu nombre: ");
		cadena = teclado.nextLine();
		fw.write(cadena + "\n");
		System.out.println("Introduce tu Apellidos: ");
		cadena = teclado.nextLine();
		fw.write(cadena + "\n");
		System.out.println("Introduce tu Ciudad de Nacimiento: ");
		cadena = teclado.nextLine();
		fw.write(cadena + "\n");
		fw.close();

		FileReader fr = new FileReader(fich);
		System.out.println("El fichero contiene: ");
		int chr = fr.read();
		while(chr != -1) {
			System.out.print((char)chr);
			chr = fr.read();
		}

		teclado.close();
		fr.close();
	}

}
