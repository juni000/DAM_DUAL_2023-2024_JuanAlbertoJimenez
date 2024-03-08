package clase_1;

import java.io.File;

public class Ejemplo_File {

	public static void main(String[] args) {
		File fich = new File("E:\\Juan_Hijo\\DAM_1º\\Acceso_Datos\\Files\\libros.xml");
		if (fich.exists()) {
			System.out.println("Directorio padre: " + fich.getParent());
			System.out.println("Ruta absoluta: " + fich.getAbsolutePath());
			System.out.println("Ruta relativa: " + fich.getPath());
			System.out.println("Tamaño en bytes: " + fich.length());
		}else {
		}
		File dir = new File("EjemploAD");
		if (dir.exists()) {
			System.out.println("Directorio existe en: " + dir.getAbsolutePath());
		}else {
			dir.mkdir();
		}
	}

}
