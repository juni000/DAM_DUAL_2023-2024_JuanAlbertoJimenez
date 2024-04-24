package ej1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramPacket_Main {

	public static void main(String[] args) throws IOException {
		int port = 8335;
		InetAddress destino = InetAddress.getLocalHost();
		byte[] mensaje = new byte[1042];
		String saludo = "Enviando aaaaaaaaaaaaaa saludo";
		mensaje = saludo.getBytes();
		DatagramPacket envio = new DatagramPacket(mensaje, mensaje.length, destino, port);
		
		System.out.println("Puerto: " + envio.getPort());
		System.out.println("Destino: " + envio.getAddress().getHostName());
		System.out.println("Enviado desde el puerto local: 8336");
		DatagramSocket socket = new DatagramSocket(8336);
		while (true) {
			socket.send(envio);
		}
	}

}
