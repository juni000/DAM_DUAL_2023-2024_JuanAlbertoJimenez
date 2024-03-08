package ejem2;

public class TareaAlive implements Runnable{
	private Thread otroHilo;
	public TareaAlive(Thread otroHilo) {
		this.otroHilo = otroHilo;
	}
	@Override
	public void run() {
		while (otroHilo.isAlive()) {
			System.out.println("Yo hago cosas mientras el otro hilo siga en ejecucion");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("El otro hilo ha terminado. Yo tambien");
	}
	
}
