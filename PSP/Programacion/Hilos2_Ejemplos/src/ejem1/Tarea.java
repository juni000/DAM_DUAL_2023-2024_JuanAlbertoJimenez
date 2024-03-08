package ejem1;

public class Tarea extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Soy el hilo " + i + " un hilo y esto es lo que hago.");
		}
	}
}
