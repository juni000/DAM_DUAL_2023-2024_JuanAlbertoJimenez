package sincronizacion;

public class Principal {

	public static void main(String[] args) {
		RescursoJardin jardin = new RescursoJardin();
		
		for (int i = 0; i < 10; i++) {
			(new EntraJardin("Entra el "+ i, jardin)).start();
		}
		for (int i = 0; i < 10; i++) {
			(new SaleJardin("Entra el "+ i, jardin)).start();
		}
	}

}
