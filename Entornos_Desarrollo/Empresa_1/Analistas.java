
/**
 * Write a description of class Analistas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Analistas extends Empleados
{
    // instance variables - replace the example below with your own
    private String nombre;
    
    /**
     * Constructor for objects of class Analistas
     */
    public Analistas(String nombre)
    {
        this.nombre = nombre;
    }

    public void visualizar(){
        System.out.println("Nombre: " + nombre);
    }
}
