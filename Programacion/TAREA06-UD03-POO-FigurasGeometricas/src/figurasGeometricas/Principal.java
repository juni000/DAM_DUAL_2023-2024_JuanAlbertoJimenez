package figurasGeometricas;

import java.util.Scanner;

public class Principal {
	
	private static final int TAMANO=50;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0, radio = 0, base = 0, altura = 0, ancho = 0, alto = 0;
		double area = 0;
		do {
			System.out.println("\n\t Menú de operaciones");
			System.out.println("\t 1) Círculo \n \t 2) Triángulo \n\t 3) Rectángulo \n\t 4) Salir");
			opcion = teclado.nextInt();
			Circulo[] circulos = new Circulo[TAMANO];
			
			switch (opcion) {
			case 1:
				System.out.println("Crear cículo;");
				System.out.println("Introduce el radio del círculo: ");
				radio = teclado.nextInt();
				circulos[Circulo.numeroObjetos]= new Circulo(radio);
				circulos[Circulo.numeroObjetos-1].imprimirObjeto();
				System.out.println("El área del círculo es " + circulos[Circulo.numeroObjetos-1].calcularArea() + " U ");
				System.out.println("El perímetro del círculo es " + circulos[Circulo.numeroObjetos-1].calcularPerimetro());
				break;
			case 2:
				System.out.println("Crear triángulo;");
				System.out.println("Introduce la base del triángulo: ");
				base = teclado.nextInt();
				System.out.println("Introduce la altura del triángulo: ");
				altura = teclado.nextInt();
				TrianguloEquilatero tri1 = new TrianguloEquilatero(base, altura);
				tri1.imprimirObjeto();
				try {
					area = tri1.calcularArea();
				} catch (Exception ex) {
					System.out.println("Exepción general: " + ex.getMessage());
				}
				System.out.println("El área del triángulo es " + area);
				System.out.println("El perímetro del triángulo es " + tri1.calcularPerimetro());
				break;
			case 3:
				System.out.println("Introduce el ancho del rectángulo: ");
				ancho = teclado.nextInt();
				System.out.println("Introduce el alto del rectángulo: ");
				alto = teclado.nextInt();
				Rectangulo rec1 = new Rectangulo(ancho, alto);
				rec1.imprimirObjeto();
				System.out.println("El área del triángulo es " + rec1.calcularArea());
				System.out.println("El perímetro del triángulo es " + rec1.calcularPerimetro());
				break;
			case 4:
				break;

			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (opcion != 4);

		System.out.println("Número de círculos: " + Circulo.numeroObjetos + " Número de rectángulos: "
				+ Rectangulo.numeroObjetos + " Número de triángulos" + TrianguloEquilatero.numeroObjetos);
		teclado.close();

	}

}
