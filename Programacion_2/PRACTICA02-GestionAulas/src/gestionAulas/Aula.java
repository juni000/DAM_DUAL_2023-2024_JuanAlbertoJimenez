package gestionAulas;

public abstract class Aula {
	private int magnitud = 30; //tamaño en m2
	private int usuarios = 0; //número de alumnos
	
	public Aula(int usuarios) {
		this.usuarios = usuarios;
	}
	public int getMagnitud() {
		return magnitud;
	}
	public void setMagnitud(int magnitud) {
		this.magnitud = magnitud;
	}
	public int getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(int usuarios) {
		this.usuarios = usuarios;
	}
	public abstract void avisoExcesoCapacidad();
	 public abstract void imprimirInfo();
	
}
