package clase_1;

import java.io.File;
import java.io.IOException;

public class Ej1 {

	public static void main(String[] args) {
		File fich = new File("EjemploAD\\ejemplo.txt");
		if (fich.exists()) {
			System.out.println("Fichero existe en: " + fich.getAbsolutePath());
		} else {
			System.out.println("El fichero no existe, creandolo...");
			try {
				fich.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("No ha sido posible.");
			}
			System.out.println("Fichero creado.");
		}
	}

}
