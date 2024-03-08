package ejemploThis;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("INICIO: Número de objetos: " + Rectangulo.getContadorobj());
		
		Rectangulo rect1 = new Rectangulo(5,7);
		
		rect1.imprimirRect();
		
		Rectangulo rect2 = rect1.incrmentarAncho();

		rect2.imprimirRect();
		rect1.imprimirRect();
		
		Rectangulo rect3 = new Rectangulo(5);
		rect3.imprimirRect();
				
		System.out.println("FINAL: Número de objetos: " + Rectangulo.getContadorobj());
		
		System.out.println("Hash de rect 1 " + rect1.hashCode());
		System.out.println("Hash de rect 2 " + rect2.hashCode());
		System.out.println("Hash de rect 3 " + rect3.hashCode());
		
		System.out.println("To String de rect 1 " + rect1.toString());
		System.out.println("To String de rect 2 " + rect2.toString());
		System.out.println("To String de rect 3 " + rect3.toString());



		
	}

}
