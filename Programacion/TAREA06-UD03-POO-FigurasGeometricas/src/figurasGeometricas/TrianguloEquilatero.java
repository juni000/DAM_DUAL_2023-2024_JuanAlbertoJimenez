package figurasGeometricas;

public class TrianguloEquilatero {
	// Atributos
	private int base;
	private int altura;
	public static int numeroObjetos;

	// Constructores
	public TrianguloEquilatero() {
		TrianguloEquilatero.numeroObjetos++;
	}

	public TrianguloEquilatero(int base, int altura) {
		this.base = base;
		this.altura = altura;
		TrianguloEquilatero.numeroObjetos++;
	}

	// Metodos
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {
		return ((this.base * this.altura) / base);
	}

	public int calcularPerimetro() {
		return this.base * 3;
	}

	public void imprimirObjeto() {
		System.out.println("El triángulo tiene " + this.base + " U de base y " + this.altura + " U de altura.");
	}
}
