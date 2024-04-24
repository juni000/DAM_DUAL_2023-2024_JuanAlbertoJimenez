package clase_6_SAX;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ClaseSAX {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factoria = SAXParserFactory.newInstance();
		SAXParser analizador = factoria.newSAXParser();
		
		ManejadorSAX mSAX = new ManejadorSAX();
		
		File fichXML = new File("empleados.xml");
		analizador.parse(fichXML, mSAX);
		
	}
	
}
