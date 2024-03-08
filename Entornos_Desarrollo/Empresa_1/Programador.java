
/**
 * Write a description of class Programador here.
 * 
 * @author (juan alberto) 
 * @version (a version number or a date)
 */
public class Programador extends Empleados
{
    // instance variables - replace the example below with your own
    private String nombre;
    protected int jornadaLaboral;
    protected int horasExtra;
    public static final int precioHora=20;
    private Ordenador pc;
    /**
     * Constructor for objects of class Programador
     */
    public Programador()
    {
        // initialise instance variables
    }
    public Programador(String nombre, int jornadaLaboral, int horasExtra, Ordenador pc){
        this.nombre=nombre;
        this.jornadaLaboral=jornadaLaboral;
        this.horasExtra=horasExtra;
        this.pc=pc;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getJornadaLaboral(){
        return jornadaLaboral;
    }
    public void setJornadaLaboral(int jornadaLaboral){
        this.jornadaLaboral=jornadaLaboral;
    }
    public int getHorasExtra(){
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra){
        this.horasExtra=horasExtra;
    }
    public float getPrecioHora(){
            return precioHora;
    }
    public int calcularSueldo(){
        return precioHora*jornadaLaboral*4 + horasExtra*precioHora*2;
    }
    public void visualizar(){
        System.out.println("Nombre: " + nombre + "PC cpu: " + pc.cpu + "  ram: " + pc.ram);
        
    }
}
