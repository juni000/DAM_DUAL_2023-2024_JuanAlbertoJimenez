

public class Cuenta
{
    protected String nombre_Apellido;
    protected int numero_cuenta;
    protected double dinero;

    public Cuenta()
    {
    }

    public void pasarReciboTargeta(){
        dinero -= 20;
    }
     public void comprobanteNumerosRojos(){
        if (dinero<0.00){
            dinero -= 100;
        }
    }
    public void reciboPorQueSi(int cargo, String asunto){
         System.out.println(asunto);   
         dinero += cargo;
        }
    public double bitCoin(){
        return dinero/491.59;
    }
    public void imprimirDatos(){
        System.out.println("Nombre y apellidos: " + nombre_Apellido + "\nNúmero de cuenta: " + numero_cuenta + "\nDinero: " + dinero);
    }
}
