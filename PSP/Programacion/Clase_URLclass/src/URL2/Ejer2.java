package URL2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ejer2 {
	

	public static void main(String[] args) {
		URL url = null;
	try {
		url = new URL("https://twicpics.rowenta.es/https://dam.groupeseb.com/m/51811059ce9509af/Digital-ROWENTA_RH6737WH_Visual1.tiff?timestamp=20230208162929&twic=v1/contain=736x552");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	BufferedReader in;

	try {
		InputStream inputStream = url.openStream();
		in = new BufferedReader(new InputStreamReader(inputStream));
		String inputLine;
		while ((inputLine = in.readLine())!= null) {
			System.out.println(inputLine);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
