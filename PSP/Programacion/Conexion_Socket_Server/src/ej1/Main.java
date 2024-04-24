package ej1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "172.16.1.53";
		Scanner teclado = new Scanner(System.in);
		int puerto = 8336;
		while (true) {
			Socket cliente = new Socket(host, puerto);
			OutputStream salida = cliente.getOutputStream();

			DataOutputStream flujoSalida = new DataOutputStream(salida);

			System.out.println("Mensaje que quires mandar: ");

			int mensaje = teclado.nextInt();

			flujoSalida.writeInt(mensaje);
			if (mensaje == -1) {
				break;
			}
			InputStream entrada = cliente.getInputStream();
			DataInputStream flujoEntrada = new DataInputStream(entrada);

			System.out.println("Recibido del Server : " + flujoEntrada.readInt());

			entrada.close();
			flujoEntrada.close();
			flujoSalida.close();
			salida.close();
			cliente.close();
		}
		

	}

}
