package sincronizacion2;

public class Principal {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(40);
		SacarDinero h1 = new SacarDinero("Pantoja", c);
		SacarDinero h2 = new SacarDinero("Paquirrin", c);
		
		h1.start();
		h2.start();
	}

}
