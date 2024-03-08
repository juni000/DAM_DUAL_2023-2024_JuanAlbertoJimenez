package tiendaComidaRapida;

public class Kebab {
	public static int numeroPedidos;
	public static final int precioMinimo = 6;
	public static final int tiempoMinimo = 15;
	private int numeroIngredientesAdicionales;

	public Kebab() {
		this.numeroIngredientesAdicionales = 0;
		Kebab.numeroPedidos++;
	}

	public Kebab(int numeroIngredientesAdicionales) {
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
		return (Kebab.precioMinimo + this.numeroIngredientesAdicionales);
	}

	public int tiempoEntrega() {
		return (Kebab.tiempoMinimo + this.numeroIngredientesAdicionales * 10);
	}

	public void mostrarPedido() {
		System.out.println("Kebab con Número de ingredientes adicionales: " + this.numeroIngredientesAdicionales
				+ " Precio comida: " + precioComida() + "€ Tiempo de entrega: " + tiempoEntrega() + " Minutos");
	}
}
