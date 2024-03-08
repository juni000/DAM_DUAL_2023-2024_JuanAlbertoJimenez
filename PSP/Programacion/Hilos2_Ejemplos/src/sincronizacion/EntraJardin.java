package sincronizacion;

public class EntraJardin extends Thread {
	private RescursoJardin jardin;
	
	public EntraJardin(String nombre, RescursoJardin j) {
		this.setName(nombre);
		this.jardin = j ;
	}
	
	@Override
	public void run() {
		jardin.incrementaCuenta();
	}

}
