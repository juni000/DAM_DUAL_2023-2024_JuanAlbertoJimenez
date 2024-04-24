package electrodomesticos;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	public static int precioElectrodomesticos = 0;
	public static void calcularPrecioTotal(Electrodomesticos elec) {
		
		if (elec.comprobarConsumoEnergetico()) {
			precioElectrodomesticos += elec.precioFinal();
		} else {
			System.out.println("*** Electrodoméstico con consumo energético no aceptado ***");
		}
	}
	

	public static void main(String[] args) {
		
		ArrayList<Electrodomesticos> electro = new ArrayList<Electrodomesticos>();
		
		electro.add(new Lavadora('B',30,60));
		electro.add(new Televisor('C',35,30));
		electro.add(new Lavadora('F',30,45));
		electro.add(new Televisor('A',20,50));
		electro.add(new Televisor('E',20,50));
		
		for (Electrodomesticos electrodomesticos : electro) {
			calcularPrecioTotal(electrodomesticos);
		}
		System.out.println("Precio total: " + precioElectrodomesticos);
		System.out.println("Electrodomesticos totales: " + Electrodomesticos.numeroElectrodomesticos);
		System.out.println((int)'D');
		
	}

}
