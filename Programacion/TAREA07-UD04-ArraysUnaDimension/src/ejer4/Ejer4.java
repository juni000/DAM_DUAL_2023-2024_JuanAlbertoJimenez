package ejer4;

public class Ejer4 {
	private static final int TAMANIO = 100;
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = i+1;
		}
	}
	public static void llamarArray(int[] lista) {
		int suma = 0;
		System.out.print("{");
		for (int i = 0; i < lista.length; i++) {
			if (i==lista.length-1) {
				System.out.print(lista[i]);
			}else System.out.print(lista[i] + ",");
			suma = suma + lista[i];
		}
		System.out.print("}");
		System.out.println("\nLa suma es: " + suma);
		System.out.println("La media es: " +((double)suma/(double)lista.length));

	}
	public static void main(String[] args) {
		
		int[] lista = new int[TAMANIO];
		rellenarArray(lista);
		llamarArray(lista);
	}

}
