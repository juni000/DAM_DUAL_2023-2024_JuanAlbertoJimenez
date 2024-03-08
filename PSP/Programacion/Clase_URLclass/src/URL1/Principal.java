package URL1;

import java.net.MalformedURLException;
import java.net.URL;

public class Principal {

	private static void visualizar(URL url) {
		System.out.println("\tURL Completo: " + url.toString());
		System.out.println("\tgetProtocolo: " + url.getProtocol());
		System.out.println("\tgetHost: " + url.getHost());
		System.out.println("\tgetPort: " + url.getPort());
		System.out.println("\tgetFile: " + url.getFile());
		System.out.println("\tgetUserInfo: " + url.getUserInfo());
		System.out.println("\tgetPath: " + url.getPath());
		System.out.println("\tgetAuthority: " + url.getAuthority());
		System.out.println("\tgetQuery: " + url.getQuery());
		System.out.println("\tgetDefaultPort: " + url.getDefaultPort());
		System.out.println("==========================================================");

	}

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://ufv-es.instructure.com/courses/35101/assignments/306757");
		visualizar(url);
		URL url2 = new URL("https", "docs.oracle.com", "/javase/10");
		visualizar(url2);

	}

}
