package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		int c = 0, f = 0;
		for (c = 10; c <= 100; c = c + 10) {
			f = ((c * 9) / 5) + 32;
			System.out.println(c + " grados Celsius son: " + f + " grados Fahrenheit");
			f = ((c / 9) * 5) -32;
			System.out.println(c + " grados Fahrenheit son: " + f + " grados Celcius");
		}
	}

}
