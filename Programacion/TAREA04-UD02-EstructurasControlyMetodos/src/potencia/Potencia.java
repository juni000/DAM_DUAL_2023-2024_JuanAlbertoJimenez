package potencia;

import java.util.Scanner;

public class Potencia {

		public static int potencia(int n, int m) {
			if (m >= 1){
				return n * potencia(n, m- 1);			
			}else {
				return 1;
			}
			}
	
		public static void main(String[] args) {
			int n=0, m = 0;
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce un número: ");
			n = teclado.nextInt();
			System.out.println("Introduce su potencia: ");
			m = teclado.nextInt();
			
			System.out.println(n + " elevado a "+ m + " " + potencia(n, m));
			teclado.close();
		}

	}

