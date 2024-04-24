package clase_5_Xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class ej1 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		fabrica.setIgnoringComments(true);

		fabrica.setIgnoringElementContentWhitespace(true);

		DocumentBuilder creaArbol = fabrica.newDocumentBuilder();
		File fichero = new File("hola");
		if (fichero.exists()) {
			Document arbolXML = creaArbol.parse(fichero);
			System.out.println("Arbol Creado");
			 Node punteroRaiz = arbolXML.getFirstChild();
			 System.out.println("La raiz del árbol es de tipo: " + punteroRaiz.getNodeType());
			 System.out.println("El valor del nodo raiz es: " + punteroRaiz.getNodeName());
		}
	}

}
