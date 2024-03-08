package figurasGeometricasArrayList;

public class Rectangulo implements Cloneable {
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

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
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

	
	@Override
	public String toString() {
		return ("El rectangulo tiene " + super.toString()+ " " + this.ancho + " U de ancho y " + this.alto + " U de alto.");
	}
	@Override
	public boolean equals(Object objeto) {
		Rectangulo rectangulo = (Rectangulo) objeto;
		return (this.alto == rectangulo.alto && this.ancho == rectangulo.ancho);
	}
}
