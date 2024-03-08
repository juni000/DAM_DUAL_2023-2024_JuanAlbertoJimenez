package clase_4_File.In.Out.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Clase_4_FileInputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fichBinario = new FileOutputStream("textoBinario.ddr");
		String cadena = "Esto es una prueba";
		byte bit[] = cadena.getBytes();
		
		fichBinario.write(bit);
		fichBinario.close();
	}

}
