package ejem1;

public class Main {

	public static void main(String[] args) {
		Tarea tarea = new Tarea();
		tarea.start();
		System.out.println("yo soy el hilo princiàl y sigo currando");
		System.out.println("Fin del hilo principal");
	}

}
