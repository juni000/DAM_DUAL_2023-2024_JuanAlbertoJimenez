package tiendaComidaRapida;

public class Hamburguesa {
	public static int numeroPedidos;
	public static final int precioMinimo = 10;
	public static final int tiempoMinimo = 20;
	private int numeroIngredientesAdicionales;
	
	public Hamburguesa() {
		this.numeroIngredientesAdicionales=0;
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
		return (Hamburguesa.precioMinimo + this.numeroIngredientesAdicionales);
	}
	public int tiempoEntrega() {
		return (Hamburguesa.tiempoMinimo + this.numeroIngredientesAdicionales * 10);
	}
	public void mostrarPedido() {
		System.out.println("Hamburguesa con número de ingredientes adicionales: " + this.numeroIngredientesAdicionales
				+ " Precio comida: " + precioComida() + "€ Tiempo de entrega: " + tiempoEntrega() + " Minutos");
	}
}
