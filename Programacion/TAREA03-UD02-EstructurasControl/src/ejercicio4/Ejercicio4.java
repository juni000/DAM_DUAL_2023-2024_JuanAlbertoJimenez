package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		int a = 0;

		while (a <= 50) {
			System.out.println("Los pares del 0 al 50 : " + a);
			a = a + 2;
		}
		a = 0;
		do {
			System.out.println("Los pares del 0 al 50 : " + a);
			a = a + 2;
		} while (a <= 50);

		for (a = 0; a <= 50; a = a + 2) {
			System.out.println("Los pares del 0 al 50 : " + a);

		}

	}

}
