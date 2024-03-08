package juego_cartas;

import java.util.ArrayList;

public class Esbirro {
	private String nombre;
	private int coste;
	private int ataque;
	private int vida;
	private String raza;
	private String rareza;
	private String pasiva;
	private static int numcartas = 0;
	private static int manaTotal;
	private static ArrayList<String> razas = new ArrayList<String>();

	// Constructor
	public Esbirro(String nombre, int coste, int ataque, int vida, String raza, String rareza, String pasiva) {
		this.nombre = nombre;
		this.coste = coste;
		this.ataque = ataque;
		this.vida = vida;
		this.raza = raza;
		this.rareza = rareza;
		this.pasiva = pasiva;
		numcartas++;
		manaTotal += coste;

		if (razas.size() == 0) {
			razas.add(raza);
		}
		for (int i = 0; i < razas.size(); i++) {
			// compareToIgnoreCase compara dos String y devuelve -1 si lo contiene, 0 si son
			// iguales, 1 si no son iguales.
			if (razas.get(i).compareToIgnoreCase(raza) != 0) {
				razas.add(raza);
			}
		}

	}

	// Getters and setters

	public int getCoste() {
		return coste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
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

	// Metodos
	private static float calcPromedioMana() {
		return ((float)manaTotal / (float)numcartas);
	}
	//Este metodo es para que las palabras salgan con un buen formato
	private static String formalizarPalabra(String pal) {
		return pal.substring(0,1).toUpperCase() + pal.substring(1).toLowerCase();
	}
	
	//Este metodo existe para que las razas salgan formalizadas todas
	private static String razasMazo() {
		String total = "";
		for (int i = 0; i < razas.size() - 1; i++) {
			total += formalizarPalabra(razas.get(i)) + ", ";
		}
		return total;
	}
	public static void resumenMazo() {
		System.out.println("\nTu mazo de esbirros cuenta con " + numcartas + " cartas con un mana medio de "
				+ Esbirro.calcPromedioMana() + " mana y esta construdo de las siguientes razas: " + Esbirro.razasMazo());
	}

	public void resumenCarta() {
		System.out.println("\n\t\t" + this.coste + "\n\t\t" + formalizarPalabra(this.nombre) + "\n\t\t" + formalizarPalabra(this.raza) + "\n\t" + this.pasiva
				+ "\n\t" + this.ataque + "\t\t" + this.vida + "\n\t\t" + formalizarPalabra(this.rareza));
	}

}
