package leerStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerStream {
	public static int leerScanner(File fichero) throws FileNotFoundException {
		Scanner sc = new Scanner(fichero);
		int resultado = 0, numero = 0;
		System.out.println(" [leerScanner]--> Leemos con Scanner");
		while(sc.hasNext()) {
		numero = sc.nextInt();
		System.out.println(" [leerScanner]--> Se lee: " + numero);
		resultado += numero;
		}
		sc.close();
		return resultado;
		}
	public static int leerStream (File fichero) throws FileNotFoundException, IOException {
		int resultado = 0;
		System.out.println(" [leerStream]--> Leemos con Stream");
		InputStreamReader ist = new InputStreamReader (new FileInputStream(fichero));
		BufferedReader br = new BufferedReader(ist);
		String cadena = br.readLine();
		String[] numberstexto = cadena.split(" ");
		for (int i=0; i<numberstexto.length; i++) {
		System.out.println(" [leerStream]--> Se lee: " + numberstexto[i]);
		resultado += Integer.parseInt(numberstexto[i]);
		}
		br.close();
		return resultado;
		}
	public static void main(String[] args) throws IOException {
		System.out.println("[Main]--> Escribimos en un fichero.");
		File fic = new File("numeros.txt");
		fic.createNewFile();
		FileWriter fw = new FileWriter(fic);
		fw.write("1 2 4 5");
		fw.close();
		System.out.println("[Main]-->leerScanner resultado: " + leerScanner(fic));
		System.out.println("[Main]-->leerStream resultado: " + leerStream(fic));
		System.out.println("[Main]--> Bye!!");
	}

}
