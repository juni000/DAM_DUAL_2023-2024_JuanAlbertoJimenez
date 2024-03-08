package tiendaComidaRapida;

public class Pizza {
	public static int numeroPedidos;
	public static final int precioMinimo = 8;
	public static final int tiempoMinimo = 30;
	private int numeroIngredientesAdicionales;
	
	public Pizza() {
		this.numeroIngredientesAdicionales=0;
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
		return (Pizza.precioMinimo + this.numeroIngredientesAdicionales);
	}
	public int tiempoEntrega() {
		return (Pizza.tiempoMinimo + this.numeroIngredientesAdicionales * 10);
	}
	public void mostrarPedido() {
		System.out.println("Pizza con Número de ingredientes adicionales: " + this.numeroIngredientesAdicionales
				+ " Precio comida: " + precioComida() + "€ Tiempo de entrega: " + tiempoEntrega() + " Minutos");
	}
}
