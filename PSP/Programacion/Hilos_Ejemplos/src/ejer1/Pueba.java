package ejer1;

public class Pueba {
	public static int sumatorio(int num) {
		int suma = 0;
		for (int i = num; i >= 1; i--) {
			suma += i;
		}
		return suma;
	}

	public static void main(String[] args) throws InterruptedException {
		double inicio = (double) System.currentTimeMillis();
		System.out.println(
				"Suamtorio de de 9,8 y 24: " + ((sumatorio(10000) + sumatorio(12341) + sumatorio(12340000)) / 3));
		double fin = (double) System.currentTimeMillis();
		System.out.println("Tiempo: " + ((double) System.currentTimeMillis() - inicio));

		fin = (double) System.currentTimeMillis();

		Sumatorio s1 = new Sumatorio(10000);
		Sumatorio s2 = new Sumatorio(12341);
		Sumatorio s3 = new Sumatorio(12340000);
		s1.start();
		s2.start();
		s3.start();
		s1.join();
		s2.join();
		s3.join();
		System.out.println("Resultado: " + ((s1.getResultado() + s2.getResultado() + s3.getResultado()) / 3));
		System.out.println("Tiempo: " + ((double) System.currentTimeMillis() - fin));

		fin = (double) System.currentTimeMillis();
		Espera e1 = new Espera(3000);
		Espera e2 = new Espera(2000);
		Espera e3 = new Espera(1000);
		e1.start();
		e2.start();
		e3.start();
		e1.join();
		e2.join();
		e3.join();
		System.out.println("Tiempo. " + (((double) System.currentTimeMillis() - fin)) / 1000);

	}

}
