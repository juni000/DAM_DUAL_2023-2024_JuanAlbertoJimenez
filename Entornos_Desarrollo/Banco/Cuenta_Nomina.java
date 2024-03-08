
/**
 * Write a description of class Cuenta_Nomina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuenta_Nomina extends Cuenta
{
    private double nomina;
    private String empresa;
    
    public void ingrasarNomina(int remuneracion)
    {
        dinero += remuneracion;
    }
    
    public void imprimirDatos()
    {
        System.out.println("Nombre y apellidos: " + nombre_Apellido + "\nNúmero de cuenta: " + numero_cuenta + "\nDinero: "
        + dinero + "\nNomina: " + nomina + "\nEmpresa: " + empresa);
    }
}
