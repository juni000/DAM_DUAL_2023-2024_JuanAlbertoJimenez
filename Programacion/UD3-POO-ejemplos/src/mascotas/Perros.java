package mascotas;

public class Perros {

	// Declarar los atributos o mienbros de la clase

	private String raza;
	private String tamano = "Grande";
	private int edad;
	private String color = "Blanco";

	// Constructores

	public Perros(String r, String t, int e, String c) {
		raza = r;
		tamano = t;
		edad = e;
		color = c;
	}

	public Perros() {

	}

	public Perros(String r, int e) {
		raza = r;
		edad = e;
	}

	// Métodos Setters y Getters
	public void setRaza(String r) {
		raza = r;
	}

	public String getRaza() {
		return raza;
	}

	public void setTamano(String t) {
		tamano = t;
	}

	public String getTamano() {
		return tamano;
	}

	public void setEdad(int e) {
		edad = e;
	}

	public int getEdad() {
		return edad;
	}

	public void setColor(String c) {
		color = c;
	}

	public String getColor() {
		return color;
	}

	// Definir las acciones, Comportamientos, Métodos
	public void dormir(int horas) {
		if (edad > 4)
			System.out.println("Domir: " + horas + " Horas, GrGrGrGrGr");
		else
			System.out.println("Domir: " + horas + " Horas, zZzZzZzZ");
	}

	public String darInformacion() {
		return "Raza: " + raza + " Tamaño: " + tamano + " Edad: " + edad + " Color: " + color;
	}

}
