/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad17.xmlconsax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author anaibislopezvara
 */
public class ManejadorSAX extends DefaultHandler {
    


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        String valor="";
        for (int i=start; i<start+length; i++) {
            valor = valor + ch[i];
        }
        System.out.println(valor);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
        if (qName.equals("empleado"))
            System.out.println("------------------------");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) 
            throws SAXException {
        //super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
    
        if (qName.equals("nombre"))
             System.out.print("Nombre empleado: ");
        else if (qName.equals("puesto"))
             System.out.print("Puesto empleado: ");
        else if (qName.equals("antiguedad"))
             System.out.print("Antiguedad empleado: ");
    
       }
  
}

    

