package academia;

public class Informatica {
	public static final int magnitud = 24;
	private int pcs = (Informatica.magnitud / 2);
	public static int numeroAulas;
	private int usuarios = 0;
	private String codigoAula;

	public Informatica(int usuarios) {
		this.usuarios = usuarios;
		Informatica.numeroAulas++;
		codigoAula = String.format("I%04d", Informatica.numeroAulas);
	}
	
	public Informatica(int usuarios , int pcs) {
		this.usuarios = usuarios;
		this.pcs = pcs;
		Informatica.numeroAulas++;
		codigoAula = String.format("I%04d", Informatica.numeroAulas);
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

	public int getPcs() {
		return pcs;
	}

	public void setPcs(int pcs) {
		this.pcs = pcs;
	}

	public boolean limiteCapacidad() {
		if (this.pcs / this.usuarios >= 1) {
			return false;
		}
		return true;
	}

	public void avisoExcesoCapacidad() {
		if (limiteCapacidad() == true) {
			System.out.println("***Cuidado, ha superado la capacidad máxima del aula de Docencia ***");
		}
	}

	public void mostrarInformacion() {
		System.out.println("Aula Informatica [" + this.codigoAula + "] => Magnitud: " + Informatica.magnitud
				+ " => Usuarios: " + this.usuarios + " => PCs: " + this.pcs);
	}
}
