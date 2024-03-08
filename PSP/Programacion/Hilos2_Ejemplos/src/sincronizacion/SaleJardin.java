package sincronizacion;

public class SaleJardin extends Thread {
	private RescursoJardin jardin;
	
	public SaleJardin(String nombre, RescursoJardin j) {
		this.setName(nombre);
		this.jardin = j ;
	}
	
	@Override
	public void run() {
		jardin.decrementaCuenta();
	}


}
