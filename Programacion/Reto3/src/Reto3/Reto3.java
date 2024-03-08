/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Reto3 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int suma, cantidad, valor, media;
		suma = 0;
		cantidad = 0;
		do {
			System.out.print("Ingrese un valor(-999 para finalizar):");
			valor = teclado.nextInt();
			if (valor != -999) {
				suma = suma + valor;
				cantidad++;
			}
		} while (valor != -999);
		if (cantidad != 0) {
			media = suma / cantidad;
			System.out.print("La media de los valores ingresados es:");
			System.out.print(media);
		} else {
			System.out.print("No se ingresaron valores.");
		}
		teclado.close();
	}

}