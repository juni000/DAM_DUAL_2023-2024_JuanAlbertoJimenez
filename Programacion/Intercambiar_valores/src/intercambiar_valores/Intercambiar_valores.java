package intercambiar_valores;

public class Intercambiar_valores {

	public static void main(String[] args) {
		
		int a = 0 , b = 0 , tmp = 0;
		
		a = 4;
		b = 7;
		System.out.println("El valor a es: " + a + " y el valor b es: " + b);
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("Despues del intercambio el valor a es: " + a + " y el valor b es: " + b);
		
	}

}
