package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;

		String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"
				+ " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\\n Duis aute irure dolor in reprehenderit in voluptate velit esse "
				+ "cillum dolore eu fugiat nulla pariatur.\\nExcepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		
		File fichero = new File("lorem.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
		bw.write(texto);
		bw.close();
		
		Ventana1 ventana1 = new Ventana1(anchoPantalla, alturaPantalla, fichero);
		Ventana2 ventana2 = new Ventana2(anchoPantalla, alturaPantalla);
		Ventana3 ventana3 = new Ventana3(anchoPantalla, alturaPantalla);
		Ventana4 ventana4 = new Ventana4(anchoPantalla, alturaPantalla);

	}

}
