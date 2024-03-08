package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	final static int SEGUNDOSENMINUTO = 60;
	final static int SEGUNDOSENHORA = 3600;

	public static void main(String[] args) {
			int t = 0;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Introduzca los segundos: ");
			t = teclado.nextInt();
			teclado.close();

			System.out.println(t +" segundos son : " );
			System.out.println("\t" + (t/SEGUNDOSENHORA) + " horas,");
			System.out.println("\t" + ((t%SEGUNDOSENHORA)/SEGUNDOSENMINUTO) + " minutos,");
			System.out.println("\t"  + ((t%SEGUNDOSENHORA)%SEGUNDOSENMINUTO) + (" segundos."));
			
		}

}
