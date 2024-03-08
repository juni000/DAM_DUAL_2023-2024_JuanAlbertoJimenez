package ejercicio2;
 
import java.util.Scanner;

public class Joven {

	public static void main(String[] args) {
		int edad = 0, nivel_de_estudios = 0, ingresos = 0; 
		boolean jasp=false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su edad:" );
		edad = teclado.nextInt();
		
		System.out.println("Introduzca su nivel de estudios:");
		nivel_de_estudios = teclado.nextInt();
		
		System.out.println("Introduzca el valor de sus ingresos:");
		ingresos = teclado.nextInt();
		teclado.close();

		jasp = (edad<=25 && nivel_de_estudios>3) || (edad<30 && ingresos>28000);
		
		System.out.println("El valor jasp: " + jasp);


	}

}
