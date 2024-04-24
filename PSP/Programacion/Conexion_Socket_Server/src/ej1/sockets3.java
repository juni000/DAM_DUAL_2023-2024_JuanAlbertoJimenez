package ej1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Scanner;

public class sockets3 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "172.16.1.53";
		Scanner teclado = new Scanner(System.in);
		int puerto = 8336;
			for (int i = 0; i < 3; i++) {
				Socket cliente = new Socket(host, puerto);

				InputStream entrada = cliente.getInputStream();
				DataInputStream flujoEntrada = new DataInputStream(entrada);

				System.out.println("Recibido del Server : " + flujoEntrada.readUTF());
				entrada.close();
				flujoEntrada.close();
				cliente.close();
			}

		}
		

}
