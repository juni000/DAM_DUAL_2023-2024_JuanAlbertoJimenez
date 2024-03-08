package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		ListaPaciente lista1 = new ListaPaciente("pm1", new int[] { 3, 6, 10, 1, 5 });
		ListaPaciente lista2 = new ListaPaciente("pm2", new int[] { 7, 2, 1, 10, 4 });
		long inicio = System.currentTimeMillis();
		Enfermero enf1 = new Enfermero("Valentino", lista1, inicio);
		Enfermero enf2 = new Enfermero("Mark", lista2, inicio);

		enf1.start();
		enf2.start();
	}

}