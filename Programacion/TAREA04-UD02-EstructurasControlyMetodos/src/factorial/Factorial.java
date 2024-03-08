package factorial;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if (n > 1){
			return n * factorial(n-1);			
		}else {
			return 1;
		}
	}
	

	public static void main(String[] args) {
		int n=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		n = teclado.nextInt();
		System.out.println("el factorial de " + n + " es: " + factorial(n));
		teclado.close();
	}

}
