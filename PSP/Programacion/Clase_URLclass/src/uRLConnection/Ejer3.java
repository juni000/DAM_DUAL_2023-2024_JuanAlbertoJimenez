package uRLConnection;
import java.net.*;
import java.io.*;
public class Ejer3 {

	public static void main(String[] args) throws IOException {
		URL url = null;
		URLConnection urlCon = null;
		try {
			url = new URL("https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html");
			urlCon = url.openConnection();
			
			BufferedReader in;
			InputStream inputStream = urlCon.getInputStream();
			in = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			while ((inputLine = in.readLine())!= null) {
				System.out.println(inputLine);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
