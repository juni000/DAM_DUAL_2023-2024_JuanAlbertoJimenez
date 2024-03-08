package figurasGeometricasArrayList;

public class Ejemplos {

	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangulo rect1 = new Rectangulo(5,7);
		Rectangulo rect2 = rect1;
		Rectangulo rect3 = new Rectangulo(5,7);
		System.out.println("1 y 3 son equals: " + rect1.equals(rect3));
		System.out.println("1 y 2 son equals: " + rect1.equals(rect2));
		System.out.println("2 y 3 son equals: " + rect2.equals(rect3));
		
		System.out.println("1 y 3 son iguales: " + (rect1 == rect3));
		System.out.println("1 y 2 son iguales: " + (rect1==rect2));
		System.out.println("2 y 3 son iguales: " + (rect2==rect3));
		
		Rectangulo rect4 = (Rectangulo) rect3.clone();
		System.out.println("rect3 : " + rect3.toString());
		
		
	}

}
