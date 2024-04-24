package lanzarProceso;

import java.util.Scanner;

public class Sumar {
	private int numero1 = 0;
	private int numero2 = 0;
	private int numero3 = 0;
	public Sumar(int numero1, int numero2, int numero3) {

		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}
	public int operacionSumar() {
		return this.numero1 + this.numero2 + this.numero3;
	}
	public static void main(String[] args) {
		String param0 = args[0];
		String param1 = args[1];
		int numero = 0;
		System.out.println(System.getProperty("user.dir"));
		System.out.println("Introduce un numero: ");
		Scanner teclado = new Scanner(System.in);
		try {
			numero = teclado.nextInt();
		} catch (Exception e) {
			System.err.print("Error al leer número 3");
			System.exit(1);
		}
		Sumar sumar = new Sumar(Integer.parseInt(param0), Integer.parseInt(param1), numero);
		System.out.println("El resultado de sumar " + param0 + ", " + param1 + " y " + numero + " es: " + sumar.operacionSumar());
		System.exit(0);
	}
}
