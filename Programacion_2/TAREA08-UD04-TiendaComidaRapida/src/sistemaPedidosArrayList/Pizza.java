package sistemaPedidosArrayList;

public class Pizza implements Pedido, Imprimible{
	public static int numeroPedidos;
	public static final int precioMinimo = 8; // En euros
	public static final int tiempoMinimo = 30; // En minutos
    private int numeroIngredientesAdicionales;
	
    public Pizza() {
    	this.numeroIngredientesAdicionales = 0;
    	Pizza.numeroPedidos++;
    }
	
    public Pizza(int numeroIngredientesAdicionales) {
    	this.numeroIngredientesAdicionales = numeroIngredientesAdicionales;
    	Pizza.numeroPedidos++;
    }
    
    
    public int getNumeroIngredientesAdicionales() {
		return numeroIngredientesAdicionales;
	}
	public void setNumeroIngredientesAdicionales(int numeroIngredientesAdicionales) {
		this.numeroIngredientesAdicionales = numeroIngredientesAdicionales;
	}
	
    public int precioComida() {
    	return (Pizza.precioMinimo + this.numeroIngredientesAdicionales * 1);
	    
    }
	    
    public int tiempoEntrega() {
	    	return (Pizza.tiempoMinimo + this.numeroIngredientesAdicionales * Pedido.TiempoPorPedido);
    }
    
    public void mostrarPedido() {
    	System.out.println("*** Inicio Pedido Pizza ***");
		System.out.println("Pizza con Número de Ingredientes Adicionales: " 
				+ this.numeroIngredientesAdicionales + " Precio Comida: " 
				+ this.precioComida() + "€ Tiempo Entrega: " + this.tiempoEntrega() + "minutos");
		System.out.println("*** Fin Pedido Pizza ***");
		}
    
}
