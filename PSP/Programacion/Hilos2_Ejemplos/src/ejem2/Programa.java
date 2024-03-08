package ejem2;

public class Programa {
	public static void main(String[] args) {
		TareaPrincipal tareaPrincipal = new TareaPrincipal();
		Thread hiloPrincipal = new Thread(tareaPrincipal);
		
		TareaAlive tareaAlive = new TareaAlive(hiloPrincipal);
		Thread hiloAlive = new Thread(tareaAlive);
		
		hiloPrincipal.start();
		hiloAlive.start();
		
		System.out.println("Se han terminado los dos hilos?");
	}
}
