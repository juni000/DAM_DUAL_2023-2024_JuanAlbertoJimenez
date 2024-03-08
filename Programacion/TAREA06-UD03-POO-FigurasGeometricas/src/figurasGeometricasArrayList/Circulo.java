package figurasGeometricasArrayList;

public class Circulo {
	// Constantes
	private static final double PI = 3.1416;
	// Atributos estaticos o de clase
	public static int numeroObjetos = 0;
	// Atributos normales o de instancia
	private int radio;

	// Constructores
	public Circulo(int radio) {
		this.radio = radio;
		Circulo.numeroObjetos++;
	}

	public Circulo() {
		Circulo.numeroObjetos++;
	}

	// Getters y Setters
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	// Metodos
	public double calcularArea() {
		return this.radio * this.radio * Circulo.PI;
	}

	public double calcularPerimetro() {
		return this.radio * Circulo.PI * 2.0;
	}

	public void imprimirObjeto() {
		System.out.println("El circulo tiene " + this.radio + " U de radio.");
	}
}
