package clase_2;

import java.io.FileReader;
import java.io.IOException;

public class Ejemplo_FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\Juan_Hijo\\DAM_1\\Acceso_Datos\\Files\\prueba.txt");
		if (fr.read() == -1) {
			System.out.println("Fichero Vacio");
		} else {
			char c = (char) fr.read();
			System.out.println("1er caracter: " + c);
			System.out.println("2do caracter: " + (char)fr.read());
		}
		fr.close();
	}

}
