package ejer1;

public class Ejer1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Bienvenido a mi programa de hilos.");
		Hilo h1 = new Hilo("Diferente");
		Hilo h2 = new Hilo("Raro");
		h1.join();
		h2.start();
		h2.join();
		System.out.println("Programa terminado.");
	}

}
