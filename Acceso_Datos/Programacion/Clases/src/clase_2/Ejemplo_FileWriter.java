package clase_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo_FileWriter {

	public static void main(String[] args) throws IOException {
		File fich = new File("E:\\Juan_Hijo\\DAM_1\\Acceso_Datos\\Files\\prueba.txt");
		FileWriter fw  = new FileWriter(fich, true);
		String text = "Esto es una prueba2.";
		char f = 'e';
		if (fich.exists()) {
			System.out.println("Fichero existe en: " + fich.getAbsolutePath());
		} else {
			System.out.println("El fichero no existe, creandolo...");
			fich.createNewFile();
			System.out.println("Fichero creado.");
		}
		fw.write(text);
		fw.write("\n");
		fw.write(f);
		fw.write("\n");
		fw.close();
		
	}

}
