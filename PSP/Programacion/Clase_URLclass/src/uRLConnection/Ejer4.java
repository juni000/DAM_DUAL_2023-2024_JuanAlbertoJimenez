package uRLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class Ejer4 {

	public static void main(String[] args) throws IOException {
		String cadena;
		URL url = new URL("https://ufv-es.instructure.com/courses/35101/assignments");
		URLConnection conexion = url.openConnection();
		System.out.println("Direccion [gerURL()]: " + conexion.getURL());
		Date fecha = new Date(conexion.getLastModified());
		System.out.println("Fecha última modificacion [getLastModified()]: " + fecha);
		System.out.println("tipo de contenido [getContentType()]: " + conexion.getContentType());
		System.out.println("==============================================================");
		System.out.println("CAMPOS 1 y 4 de cabecera");
		System.out.println("getHeaderField(1) ---->" + conexion.getHeaderField(1));
		System.out.println("getHeaderField(4) ---->" + conexion.getHeaderField(4));
		System.out.println("===========================================================");
		
		
		System.out.println("Todos los cmapos de la cabecera con getHeaderFields():");
		Map camposCabecera = conexion.getHeaderFields();
		Iterator it = camposCabecera.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry map = (Map.Entry) it.next();
			System.out.println(map.getKey() + " , " + map.getValue());
		}
		System.out.println("==============================================================");
		
		System.out.println("Contenido de (url.getfile(): " + url.getFile());
		BufferedReader pagina = new BufferedReader(new InputStreamReader(url.openStream()));
		while ((cadena = pagina.readLine()) != null) {
			System.out.println(cadena);
		}
	}

}
