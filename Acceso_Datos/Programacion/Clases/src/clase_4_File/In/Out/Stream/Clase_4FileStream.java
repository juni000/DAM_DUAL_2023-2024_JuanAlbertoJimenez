package clase_4_File.In.Out.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Clase_4FileStream {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream("1.jfif");
		FileOutputStream out = new FileOutputStream("capi.jfif");
		int n = 0, c;

		try {
			c = in.read();

			if (c == -1) {
				System.out.println("Fichero Vacio");
			} else {
				while (c != -1) {
					out.write(c);
					n++;
					c = in.read();
				}
				out.close();
				System.out.println("Se han copiado " + n + " caracteres");
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
