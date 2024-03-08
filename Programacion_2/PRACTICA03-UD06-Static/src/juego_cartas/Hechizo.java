package juego_cartas;

import java.util.ArrayList;

public class Hechizo {
	private String nombre;
	private int coste;
	private int ataque;
	private String rareza;
	private String pasiva;
	private String tipo;
	private static int numcartas = 0;
	private static int manaTotal;
	private static ArrayList<String> tipos = new ArrayList<String>();

	// Contructores
	public Hechizo(String nombre, int coste, int ataque, String tipo, String rareza, String pasiva) {
		this.nombre = nombre;
		this.coste = coste;
		this.ataque = ataque;
		this.rareza = rareza;
		this.pasiva = pasiva;
		this.tipo = tipo;
		numcartas++;
		manaTotal += coste;
		// Esto es para no repetir tipos varias veces.
		if (tipos.size() == 0) {
			tipos.add(tipo);
		}
		for (int i = 0; i < tipos.size(); i++) {
			// compareToIgnoreCase compara dos String y devuelve -1 si lo contiene, 0 si son
			// iguales, 1 si no son iguales.
			if (tipos.get(i).compareToIgnoreCase(tipo) != 0) {
				tipos.add(tipo);
			}
		}

	}

	// Getters y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public String getRareza() {
		return rareza;
	}

	public void setRareza(String rareza) {
		this.rareza = rareza;
	}

	public String getPasiva() {
		return pasiva;
	}

	public void setPasiva(String pasiva) {
		this.pasiva = pasiva;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Metodos
	private static float calcPromedioMana() {
		return ((float)manaTotal / (float)numcartas);
	}
	//Este metodo es para que las palabras salgan con un buen formato
	private static String formalizarPalabra(String pal) {
		return pal.substring(0,1).toUpperCase() + pal.substring(1).toLowerCase();
	}
	private static String tiposMazo() {
		String total = "";
		for (int i = 0; i < tipos.size() - 1; i++) {
			total += formalizarPalabra(tipos.get(i)) + ", ";
		}
		return total;
	}
	public static void resumenMazo() {
		System.out.println("\nTu mazo de Hechizos cuenta con " + numcartas + " cartas con un mana medio de "
				+ Hechizo.calcPromedioMana() + " mana y esta construdo de los siguientes tipos: " + Hechizo.tiposMazo());
	}

	public void resumenCarta() {
		System.out.println("\n\t\t" + this.coste + "\n\t\t" + formalizarPalabra(this.nombre) + "\n\t" + formalizarPalabra(this.tipo) + "\n\t" + this.pasiva
				+ "\n\t\t" + this.ataque + "\n\t\t" + formalizarPalabra(this.rareza));
	}

}
