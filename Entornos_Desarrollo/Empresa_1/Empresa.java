import java.util.Vector;
import java.util.ArrayList;

/**
 * Write a description of class Empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empresa
{
    private String nombre;
    private String pais;
    private String direccion;
    private ArrayList <Empleados> empleados;
    
    public Empresa(String nombre){
        this.nombre = nombre;
        empleados = new ArrayList();
    }

    public Empresa(String nombre, String pais, String direccion){
        this.nombre=nombre;
        this.pais=pais;
        this.direccion=direccion;
        empleados = new ArrayList();
    }
    
    public void anadir(Empleados e){
        empleados.add(e);
    }
     
    public void imprimir(){
        System.out.println("nombre: " + nombre);
        System.out.println("Pais: " + pais);
        System.out.println("Direccion: " + direccion);
        System.out.println("Empleados: ");
        for(int i = 0; i<empleados.size();i++){
            empleados.get(i).visualizar();
        }
    }
}
