package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class OperacionesFicheros {
	public File fichCar;
	public File fichBuff;
	public String cadena;

	public static final int EXIT_RETURN = 0;
	public static final int FAILURE_RETURN = -1;

	public OperacionesFicheros(File fichCar, File fichBuff, String cadena) {
		this.fichCar = fichCar;
		this.fichBuff = fichBuff;
		this.cadena = cadena;
	}
	public int escribir_fichero_car(){
		int retorno = EXIT_RETURN;
		try {
		FileWriter fw = new FileWriter(this.fichCar);
		for (int i = 0; i < this.cadena.length(); i++) {
			fw.write(this.cadena.charAt(i));
		}
		fw.close();
		}catch (IOException e) {
			retorno = FAILURE_RETURN;
		}
		return retorno;
	}
	public int leer_fichero_Buffered() throws IOException{
		int retorno = EXIT_RETURN;
		int car;
		BufferedReader br;
		String linea = "";
		try {
			br = new BufferedReader(new FileReader(this.fichCar));
			while ((car = br.read()) != -1) {
				System.out.println(br.readLine());
			}
			br.close();
			}catch (IOException e) {
				retorno = FAILURE_RETURN;
			}
			return retorno;
	}
	
	public int leer_fichero_escribir() throws IOException{
		int retorno = EXIT_RETURN;
		int car;
		FileReader fr;
		BufferedWriter bw;
		String linea = "";
		try {
			fr = new FileReader(this.fichCar);
			bw = new BufferedWriter(new FileWriter(this.fichBuff));
			
			while ((car = fr.read()) != -1) {
				if (car != '.' && car!= ',' && car != ';') {
					linea += car;
				}else {
					bw.write(linea);
					linea = "";
				}
			}
		} catch (Exception e) {
		}
		return retorno;
	}
}
