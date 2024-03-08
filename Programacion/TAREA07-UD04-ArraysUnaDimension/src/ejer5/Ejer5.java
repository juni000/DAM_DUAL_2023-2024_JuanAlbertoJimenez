package ejer5;

public class Ejer5 {
	public static void llamarArray(int[] lista) {
		System.out.print("{");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		int[] lista = { 1, 2, 3, 4, 5 };
		int[] listaInvertida = new int[lista.length];

		for (int i = 0; i < listaInvertida.length; i++) {
			listaInvertida[listaInvertida.length - i - 1] = lista[i];
		}
		for (int i = 0, j = listaInvertida.length - 1; i < listaInvertida.length && j > 0; i++, j--) {
			listaInvertida[j] = lista[i];
		}
		llamarArray(lista);
		llamarArray(listaInvertida);

	}

}
