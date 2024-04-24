package sistemaPedidosArrayList;

public class Hamburguesa implements Pedido, Imprimible{
	public static int numeroPedidos;
	public static final int precioMinimo = 10; // En euros
	public static final int tiempoMinimo = 20; // En minutos
    private int numeroIngredientesAdicionales;
	
    public Hamburguesa() {
    	this.numeroIngredientesAdicionales = 0;
    	Hamburguesa.numeroPedidos++;
    }
	
    public Hamburguesa(int numeroIngredientesAdicionales) {
    	this.numeroIngredientesAdicionales = numeroIngredientesAdicionales;
    	Hamburguesa.numeroPedidos++;
    }

   	public int getNumeroIngredientesAdicionales() {
		return numeroIngredientesAdicionales;
	}
	public void setNumeroIngredientesAdicionales(int numeroIngredientesAdicionales) {
		this.numeroIngredientesAdicionales = numeroIngredientesAdicionales;
	}
	
    public int precioComida() {
    	return (Hamburguesa.precioMinimo + this.numeroIngredientesAdicionales * 1);
	    
    }
	    
    public int tiempoEntrega() {
	    	return (Hamburguesa.tiempoMinimo + this.numeroIngredientesAdicionales * Pedido.TiempoPorPedido);
    }
		
    public void mostrarPedido() {
    	System.out.println("*** Inicio Pedido Hamburguesa ***");
		System.out.println("Hamburguesa con Número de Ingredientes Adicionales: " 
				+ this.numeroIngredientesAdicionales + " Precio Comida: " 
				+ this.precioComida() + "€ Tiempo Entrega: " + this.tiempoEntrega() + "minutos");
		System.out.println("*** Fin Pedido Hamburguesa ***");
		}
    
	
}
