/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad17.xmlconsax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author anaibislopezvara
 */
public class AD17XMLconSAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            //1.1 Crear un objeto de tipo SAXParser que será el 
            //analizador del XML
            SAXParserFactory factoria = SAXParserFactory.newInstance(); 
            SAXParser analizador = factoria.newSAXParser();
            
            //1.2 Crear un objeto de una clase que herede de la clase 
            //DefaultHandler para implementar los métodos que manejarán
            //los eventos de SAX
            ManejadorSAX mSAX = new ManejadorSAX();            
            
            //Hasta aquí tengo los elementos iniciales para comen   zar a 
            //recorrer secuencialmente el archivo XML y ejecutar los elementos
            //que implementan la funcionalidad
            
            //Comenzamos a recorrer el xml
            //previamente deben estar definido el código correspondiente a los eventos que
            //se atenderán de acuerdo a la funcionalidad
            
            File fichXML = new File ("empleados.xml");
            analizador.parse(fichXML, mSAX);
            
            
        } catch (Exception e) {
            System.out.println("Error en el archivo XML");
        }
         
        
        }
        
    }
    

