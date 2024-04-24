/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad_practica_SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author juana
 */
public class AD_Practica_Manejador_SAX extends DefaultHandler{
    //creo un atributo de la clase para poder pasarsela con el constructor
    private String puesto;
    //correcto existe porque al ser puesto el segundo nodo necesito una bandera para sacar el nodo antiguedad que es el siguiente
    private static boolean correcto = false;
    //variable nombre para guardar el nombre,existe ya que va el nombre va antes que el puesto entonces tengo que almacenarlo para utilizarlo
    private static String nombre;
    //este contador me permite sacar los textos del xml, ya que van de tres en tres este nunca superara 2
    private static int contador = 0;
    
    public AD_Practica_Manejador_SAX(String puesto) {
        this.puesto = puesto;
    }
    
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        String valor="";
        for (int i=start; i<start+length; i++) {
            valor = valor + ch[i];
        }
        //si el valor no esta en blanco o es nulo podemos empezar a almacenarlos
        if (!valor.isBlank()) {
            
            if (correcto) {
                //ya que correrto es true sabemos que ya ha imprimdo el nombre y el puesto, imprimo la antiguedad y reinicio el contador asi como cambio el correcto a false
                 System.out.println("Antiguedad empleado: " + valor);
                 contador = 0;
                 correcto = false;
                 System.out.println("--------------------------");
            }else{
                //el contador en 0 es el nombre, en 1 el puesto,el 2 la antiguedad, no guardo las dos ultimas ya que al hacer trigger las utilizao directamente de la variable valor
                if (contador == 0) {
                    nombre = valor;
                    contador++;
                }else if (contador == 1) {
                    contador ++;
                }else{
                     contador=0;
                 }
                //Aqui es donde compruebo si la palabra es la misma que la pasada por consola si es asi imprimo el nombre guardado y el puesto
                if (valor.toLowerCase().contains(puesto.toLowerCase())) {
                    System.out.println("Nombre empleado: " + nombre);
                    System.out.println("Puesto empleado: " + valor);
                    //cambio correto a true para que imprima la antiguedad en el siguiente trigger
                    correcto = true;
                }
            }
         }
    }

}
