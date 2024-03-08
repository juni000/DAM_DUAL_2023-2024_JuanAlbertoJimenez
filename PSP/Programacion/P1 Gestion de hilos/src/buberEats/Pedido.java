package buberEats;

public class Pedido {
	private String Nombre;
	private int[] tiempoPedido;
	
	public Pedido(String nombre, int[] tiempoPedido) {
		Nombre = nombre;
		this.tiempoPedido = tiempoPedido;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int[] getTiempoPedido() {
		return tiempoPedido;
	}
	public void setTiempoPedido(int[] tiempoPedido) {
		this.tiempoPedido = tiempoPedido;
	}

	

}
