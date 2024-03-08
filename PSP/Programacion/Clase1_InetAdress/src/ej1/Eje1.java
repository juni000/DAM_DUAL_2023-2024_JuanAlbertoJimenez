package ej1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Eje1 {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress dir = null;
		System.out.println(dir.getHostName()+ "  " + dir.getAddress() + "  " + dir.getCanonicalHostName() );
		
	}

}
