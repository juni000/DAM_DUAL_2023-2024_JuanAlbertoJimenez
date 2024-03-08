package clase_3_BufferedReader_Writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Clase_3_BufferedReader_Writer {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la direccion del archivo: ");
		String nombredir = teclado.nextLine();
		System.out.println(nombredir);
		System.out.println("Introduzca el nombre del fichero de salisda: ");
		String nombreSal = teclado.nextLine();
		System.out.println(nombreSal);
		File fich = new File(nombredir);
		if (fich.exists()) {
			File fich2 = new File(nombreSal);
			
			FileReader fichfr = new FileReader(fich);
			BufferedReader fichBR = new BufferedReader(fichfr);
			
			fich2.createNewFile();
			
			FileWriter fichrd = new FileWriter(fich2);
			BufferedWriter fichBW = new BufferedWriter(fichrd);
			
			String linea;
			char c;
			
			if ( (int)(c = (char) fichfr.read()) != -1) {
				fichrd.write(c);
				while ((linea = fichBR.readLine()) != null) {
					fichBW.write(linea);
					fichBW.newLine();
					fichBW.newLine();
				}
			}else {
				System.out.println("El archivo esta vacio.");
			}
			fichBW.flush();
			fichBW.close();
			fichBR.close();
			teclado.close();
		} else {
			System.out.println("El fichero no existe.");
		}
	}

}
