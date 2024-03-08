package main;

public class Principal {

	public static void main(String[] args) {
		Coche c1 = new Coche("Alfa Romeo", "147", 300000.0, 1500.0);
		Coche c2 = new Coche("BMW", "X7", 100000.0, "Gasofa", "Blanco",  1500.0);
		Coche c3 = new Coche();
		c3.ponMarca("Audi");
		c3.ponModelo("Q5");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}

}
