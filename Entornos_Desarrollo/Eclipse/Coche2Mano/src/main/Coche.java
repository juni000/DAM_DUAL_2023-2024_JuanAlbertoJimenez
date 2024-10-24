package main;

public class Coche {
	// Atributo privado
	private String marca;
	private String modelo;
	private double kilometros;
	private String combustible;
	private String color;
	private double precio;

	// Constructores

	public Coche(String marca, String modelo, double kilometros, String combustible, String color, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
		this.combustible = combustible;
		this.color = color;
		this.precio = precio;
	}

	public Coche() {
		super();
	}

	public Coche(String marca, String modelo, double kilometros, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
		this.precio = precio;
	}

	// Getters y Setters
	public String devuelveMarca() {
		return marca;
	}

	public void ponMarca(String marca) {
		this.marca = marca;
	}

	public String devuelveModelo() {
		return modelo;
	}

	public void ponModelo(String modelo) {
		this.modelo = modelo;
	}

	public double devuelveKilometros() {
		return kilometros;
	}

	public void ponKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public String devuelveCombustible() {
		return combustible;
	}

	public void ponCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String devuelveColor() {
		return color;
	}

	public void ponColor(String color) {
		this.color = color;
	}

	public double devuelvePrecio() {
		return precio;
	}

	public void ponPrecio(double precio) {
		this.precio = precio;
	}
	// Métodos sobreescritos

	@Override
	public String toString() {
		return "Coche " + marca + " " + modelo;
	}

	// Métodos personalizados
	public void pasarITV() {
		this.precio += 60;
	}

	public void pasarAveria(double averia) {
		this.precio += averia;
	}

	public void bitCoin() {
		System.out.println(this.precio / 40569.90);
	}

}
