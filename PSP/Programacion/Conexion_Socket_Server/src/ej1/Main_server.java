package ej1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main_server {

	public static void main(String[] args) throws IOException {
		int puerto = 8335;
		ServerSocket servidor = new ServerSocket(puerto);
		System.out.println("Escuchando en el puerto: " + servidor.getLocalPort());
	
		Socket cliente1 = servidor.accept();
		Socket cliente2 = servidor.accept();

	}

}
