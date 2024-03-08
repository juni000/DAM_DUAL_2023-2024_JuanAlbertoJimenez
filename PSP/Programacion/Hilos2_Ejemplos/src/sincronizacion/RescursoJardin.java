package sincronizacion;

public class RescursoJardin {
	private int cuenta;
	public RescursoJardin() {
		cuenta = 100;
	}
	
	public synchronized void incrementaCuenta() {
		System.out.println("hilo " + Thread.currentThread().getName() + " ------ Entra en jardin");
		cuenta++;
		System.out.println(cuenta + " en el jardin");
	}
	public synchronized void decrementaCuenta() {
		System.out.println("hilo " + Thread.currentThread().getName() + " ------ Sale de jardin");
		cuenta--;
		System.out.println(cuenta + " en el jardin");
	}
	
}
