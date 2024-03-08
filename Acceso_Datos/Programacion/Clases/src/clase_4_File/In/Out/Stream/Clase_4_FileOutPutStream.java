package clase_4_File.In.Out.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Clase_4_FileOutPutStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fichBinario = new FileOutputStream("textoBinario.ddr");
		String cadena = "Esto es una pruebaasddddddddddd";
		byte bit[] = cadena.getBytes();

		fichBinario.write(bit);
		fichBinario.close();
		File fich = new File("textoBinario.ddr");

		if (fich.exists()) {
			System.out.println("Fichero Creado");

			FileInputStream fichBinarioIn = new FileInputStream("textoBinario.ddr");
			int valorleido = fichBinarioIn.read();

			if (valorleido == -1) {
				System.out.println("Fichero vacio.");
			} else {
				while (valorleido != -1) {
					System.out.print((char) valorleido);
					valorleido = fichBinarioIn.read();
				}
			}
			fichBinarioIn.close();
		} else
			System.out.println("Fichero no creado");

	}

}
