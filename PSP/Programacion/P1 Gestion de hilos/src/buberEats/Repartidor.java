package buberEats;

public class Repartidor extends Thread {
	private String nombre;
	private Pedido lista;
	private long inicio;
	
	public Repartidor(String nombre, Pedido lista, long inicio) {
		this.nombre = nombre;
		this.lista = lista;
		this.inicio = inicio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pedido getLista() {
		return lista;
	}
	public void setLista(Pedido lista) {
		this.lista = lista;
	}
	public long getInicio() {
		return inicio;
	}
	public void setInicio(long inicio) {
		this.inicio = inicio;
	}
	
	private void tiempoReparto(int segundos) {
		try {
			Thread.sleep(segundos * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "Repartidor [nombre=" + nombre + ", lista=" + lista + ", inicio=" + inicio + "]";
	}

	public void Repartir(Pedido lista, long timeStamp) {
		System.out.println("El repartidos " + this.nombre + " comienza a repartir el pedido  "
				+ lista.getNombre() + " en el tiempo: " + ((System.currentTimeMillis() - timeStamp) / 1000) + " segs");
		for (int i = 0; i < lista.getTiempoPedido().length; i++) {
			this.tiempoReparto(lista.getTiempoPedido()[i]);
			System.out.println("Vacunando al paciente " + (i + 1) + " -> Tiempo: "
					+ ((System.currentTimeMillis() - timeStamp) / 1000) + " segs");
		}
		System.out.println("El enfermo " + this.nombre + " haterminado de vauvnar" + lista.getNombre()
				+ " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segs");
	}
	@Override
	public void run() {
		System.out.println("El repartidor " + this.nombre + " comienza a repartir el pedido "
				+ lista.getNombre() + " en el tiempo: " + ((System.currentTimeMillis() - inicio) / 1000) + " segs");
		for (int i = 0; i < lista.getTiempoPedido().length; i++) {
			this.tiempoReparto(lista.getTiempoPedido()[i]);
			System.out.println("Repartiendo el pedido " + (i + 1) + " -> Tiempo: "
					+ ((System.currentTimeMillis() - inicio) / 1000) + " segs");
		}
		System.out.println("El repartidos " + this.nombre + " ha terminado de repartir el pedido " + lista.getNombre()
				+ " en el tiempo: " + (System.currentTimeMillis() - inicio) / 1000 + " segs");
	}
}
