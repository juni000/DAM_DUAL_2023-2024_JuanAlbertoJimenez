package ejercicio1;

public class Enfermero extends Thread {
	private String nombre;
	private ListaPaciente lista;
	private long inicio;

	public Enfermero(String nombre, ListaPaciente lista, long inicio) {
		super();
		this.nombre = nombre;
		this.lista = lista;
		this.inicio = inicio;
	}

	public ListaPaciente getLista() {
		return lista;
	}

	public void setLista(ListaPaciente lista) {
		this.lista = lista;
	}

	public long getInicio() {
		return inicio;
	}

	public void setInicio(long inicio) {
		this.inicio = inicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void tiempoVacunacion(int segundos) {
		try {
			Thread.sleep(segundos * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void vacunar(ListaPaciente lista, long timeStamp) {
		System.out.println("El enfermo " + this.nombre + " comienza a vacunar la compra del cliente "
				+ lista.getNombre() + " en el tiempo: " + ((System.currentTimeMillis() - timeStamp) / 1000) + " segs");
		for (int i = 0; i < lista.getTiempoPaciente().length; i++) {
			this.tiempoVacunacion(lista.getTiempoPaciente()[i]);
			System.out.println("Vacunando al paciente " + (i + 1) + " -> Tiempo: "
					+ ((System.currentTimeMillis() - timeStamp) / 1000) + " segs");
		}
		System.out.println("El enfermo " + this.nombre + " haterminado de vauvnar" + lista.getNombre()
				+ " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segs");
	}
	@Override
	public void run() {
		System.out.println("El enfermo " + this.nombre + " comienza a vacunar la compra del cliente "
				+ lista.getNombre() + " en el tiempo: " + ((System.currentTimeMillis() - inicio) / 1000) + " segs");
		for (int i = 0; i < lista.getTiempoPaciente().length; i++) {
			this.tiempoVacunacion(lista.getTiempoPaciente()[i]);
			System.out.println("Vacunando al paciente " + (i + 1) + " -> Tiempo: "
					+ ((System.currentTimeMillis() - inicio) / 1000) + " segs");
		}
		System.out.println("El enfermo " + this.nombre + " haterminado de vauvnar" + lista.getNombre()
				+ " en el tiempo: " + (System.currentTimeMillis() - inicio) / 1000 + " segs");
	}

}
