package clase_2;

import java.io.FileReader;
import java.io.IOException;

public class Ej2 {

	public static void main(String[] args) throws IOException {
		int contador = 0;
		int chr;
		FileReader fr = new FileReader("E:\\Juan_Hijo\\DAM_1\\Acceso_Datos\\Files\\inter.txt");
		chr = fr.read();
		if (fr.read() == -1) {
			System.out.println("vacio");
		}
		while(chr != -1) {
			if ((char)chr == '?') {
				contador++;
			}
			chr = fr.read();
		}
		System.out.println("El archivo contiene " + contador + " ?");
		fr.close();
	}

}
