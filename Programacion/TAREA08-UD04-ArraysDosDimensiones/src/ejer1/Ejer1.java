package ejer1;

public class Ejer1 {

	public static void main(String[] args) {
		int[][] tabla = { { 1, 2, 3, 4, 5, }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		System.out.println("La tabla: " + tabla);
		System.out.println("Número de filas: " + tabla.length);
		System.out.println("Número de columnas: " + tabla[0].length);

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");

			}
			System.out.println();
		}
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i][0] + " ");
		}
		System.out.println();
		for (int i = 0; i < tabla[1].length; i++) {
			System.out.print(tabla[1][i] + " ");
			
		}
	}

}
