package ejer1;

public class Hilo extends Thread {
	public Hilo(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("soy el hilo: " + this.getName() + " " + i + " " + this.getState());
		}

	}

}
