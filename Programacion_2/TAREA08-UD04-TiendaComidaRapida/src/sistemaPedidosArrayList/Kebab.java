package sistemaPedidosArrayList;

public class Kebab implements Pedido, Imprimible{
	public static int numeroPedidos;
	public static final int precioMinimo = 6; // En euros
	public static final int tiempoMinimo = 15; // En minutos
	private int numeroIngredientesAdicionales;
	
	public Kebab() {
		this.numeroIngredientesAdicionales = 0;
		Kebab.numeroPedidos++;
	}
	public Kebab (int numeroIngredientesAdicionales) {
		this.numeroIngredientesAdicionales = numeroIngredientesAdicionales;
		Kebab.numeroPedidos++;
	}
	
	public int getNumeroIngredientesAdicionales() {
		return numeroIngredientesAdicionales;
	}
	public void setNumeroIngredientesAdicionales(int numeroIngredientesAdicionales) {
		this.numeroIngredientesAdicionales = numeroIngredientesAdicionales;
	}
	
	public int precioComida() {
    	return (Kebab.precioMinimo + this.numeroIngredientesAdicionales * 1);
	    
    }
	    
    public int tiempoEntrega() {
	    	return (Kebab.tiempoMinimo + this.numeroIngredientesAdicionales * Pedido.TiempoPorPedido);
    }

	public void mostrarPedido() {
		System.out.println("*** Inicio Pedido Kebab ***");
		System.out.println("Kebab con Número de Ingredientes Adicionales: " 
				+ this.numeroIngredientesAdicionales + " Precio Comida: " 
				+ this.precioComida() + "€ Tiempo Entrega: " + this.tiempoEntrega() + "minutos");
		System.out.println("*** Fin Pedido Kebab ***");
	}
    
	
	
}
