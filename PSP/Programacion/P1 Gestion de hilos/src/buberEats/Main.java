package buberEats;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Pedido pedido1 = new Pedido("pedido1", new int[] {1,2,4,5,8});
		Pedido pedido2 = new Pedido("pedido2", new int[] {2,7,7,2});
		Pedido pedido3 = new Pedido("pedido3", new int[] {5,1,6,5});
		Pedido pedido4 = new Pedido("pedido4", new int[] {8,7,2,2,8});
		long inicio = System.currentTimeMillis();
		Repartidor repartidor1 = new Repartidor("Juan",pedido1,inicio);
		Repartidor repartidor2 = new Repartidor("Pablo",pedido2,inicio);
		repartidor1.start();
		repartidor2.start();
		repartidor1.join();

		inicio = System.currentTimeMillis();
		repartidor1 = new Repartidor("Juan",pedido3,inicio);
		repartidor1.start();
		repartidor2.join();
		inicio = System.currentTimeMillis();
		repartidor2 = new Repartidor("Pablo",pedido4,inicio);
		repartidor2.start();
		
		
		Pedido pedido5 = new Pedido("pedido1", new int[] {1,2,4,5,8});
		Pedido pedido6 = new Pedido("pedido2", new int[] {2,7,7,2});
		Pedido pedido7 = new Pedido("pedido3", new int[] {5,1,6,5});
		Pedido pedido8 = new Pedido("pedido4", new int[] {8,7,2,2,8});
		
		inicio = System.currentTimeMillis();
		Repartidor repartidor3 = new Repartidor("Adrian",pedido5,inicio);
		repartidor3.start();
		repartidor3.join();
		inicio = System.currentTimeMillis();
		repartidor3 = new Repartidor("Adrian",pedido6,inicio);
		repartidor3.start();
		repartidor3.join();
		inicio = System.currentTimeMillis();
		repartidor3 = new Repartidor("Adrian",pedido7,inicio);
		repartidor3.start();
		repartidor3.join();
		inicio = System.currentTimeMillis();
		repartidor3 = new Repartidor("Adrian",pedido8,inicio);
		repartidor3.start(); 
		
	}

}
