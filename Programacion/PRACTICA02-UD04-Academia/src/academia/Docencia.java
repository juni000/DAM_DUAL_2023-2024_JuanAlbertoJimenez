package academia;

public class Docencia {
	public static final int magnitud = 36;
	public static int numeroAulas;
	private String codigoAula;
	private int usuarios = 0;

	public Docencia(int usuarios) {
		this.usuarios = usuarios;
		Docencia.numeroAulas++;
		codigoAula = String.format("D%04d", Docencia.numeroAulas);
	}

	public int getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(int usuarios) {
		this.usuarios = usuarios;
	}

	public static int getMagnitud() {
		return magnitud;
	}

	public boolean limiteCapacidad() {
		if ((Docencia.magnitud / this.usuarios) >= 1) {
			return false;
		}
		return true;
	}

	public void avisoExcesoCapacidad() {
		if (limiteCapacidad() == true) {
			System.out.println("***Cuidado, ha superado la capacidad máxima del aula de Informática. ***");
		}
	}

	public void mostrarInformacion() {
		System.out.println("Aula Docencia [" + this.codigoAula + "] => Magnitud: " + Docencia.magnitud
				+ " => Usuarios: " + this.usuarios);
	}
}
