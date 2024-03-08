package ejercicio4; 

public class Ejercicio4 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 3;

		for (int i = 0; i <= 6; i++) {
			for (int k = 0; k < c; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= b; j++) {
				System.out.print("*");
			}
			if (a < 6) {
				a += 2;
				b += 2;
				c -= 1;
			} else {
				b -= 2;
				c += 1;
			}

			System.out.println("");
		}
		System.out.println("Bye");
	}

}
