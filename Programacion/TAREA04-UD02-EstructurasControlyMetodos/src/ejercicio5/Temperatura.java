package ejercicio5;



public class Temperatura {
	public static int CelciusFahrenheit(int gr) {
		return (gr * 9 / 5 + 32);
	}
	
	public static int FahrenheitCelcius(int gr) {
		return (gr * 5 / 9 - 32);
	}

	public static void main(String[] args) {

		for ( int c = 10; c <= 100; c = c + 10) {
			System.out.println(c + " grados Celsius son: " + CelciusFahrenheit(c) + " grados Fahrenheit");
			System.out.println(c + " grados Fahrenheit son: " + FahrenheitCelcius(c) + " grados Celcius");
			System.out.println("---------------------------------------------");
		}
	}

}
