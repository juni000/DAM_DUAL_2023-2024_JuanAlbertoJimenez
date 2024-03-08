package figurasGeometricas;

public class Rectangulo {
	// Atributos
	public static int numeroObjetos;
	private int ancho;
	private int alto;

	// Constructores
	public Rectangulo() {
		Rectangulo.numeroObjetos++;
	}

	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
		Rectangulo.numeroObjetos++;
	}

	// Metodos
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public int calcularArea() {
		return this.ancho * this.alto;
	}

	public int calcularPerimetro() {
		return this.ancho * 2 + this.alto * 2;
	}

	public void imprimirObjeto() {
		System.out.println("El rectangulo tiene " + this.ancho + " U de ancho y " + this.alto + " U de alto.");
	}
}
