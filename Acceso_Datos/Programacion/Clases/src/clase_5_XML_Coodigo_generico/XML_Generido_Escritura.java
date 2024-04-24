package clase_5_XML_Coodigo_generico;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Generido_Escritura {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		fabrica.setIgnoringComments(true);
		fabrica.setIgnoringElementContentWhitespace(true);
		DocumentBuilder creaArbol = fabrica.newDocumentBuilder();
		File fichero = new File("animales.xml");

		if (fichero.exists()) {

			Document arbolXML = creaArbol.parse(fichero);
			System.out.println("Árbol creado");
			Node raiz = arbolXML.getFirstChild();

			if (raiz != null) {
				NodeList hijosRaiz = raiz.getChildNodes();

				for (int i = 0; i < hijosRaiz.getLength(); i++) {
					NodeList nietos = hijosRaiz.item(i).getChildNodes();

					if (hijosRaiz.item(i).getNodeType() == Node.ELEMENT_NODE) {

						for (int j = 0; j < nietos.getLength(); j++) {
							Node bisnietos = nietos.item(j).getFirstChild();

							if (bisnietos == null) {

							} else if (bisnietos.getNodeType() == Node.TEXT_NODE) {

								if (nietos.item(j).getNodeName() == "edad"
										&& Integer.parseInt(bisnietos.getNodeValue()) >= 15) {

									for (int k = 0; k < nietos.getLength(); k++) {

										if (nietos.item(k).getFirstChild() == null) {

										} else if (nietos.item(k).getFirstChild().getNodeType() == Node.TEXT_NODE
												|| nietos.item(k).getNodeType() == Node.ELEMENT_NODE) {
											System.out.println(nietos.item(k).getNodeName() + " : "
													+ nietos.item(k).getFirstChild().getNodeValue());
										}
									}
								}
							}
						}
					}

				}

			}
		} else {
			System.out.println("No existe.");
		}

	}
}
