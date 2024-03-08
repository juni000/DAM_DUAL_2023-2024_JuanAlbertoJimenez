package ej3;

public class Apartamento {
	public int precio = 400;
	public int m2;
	public static int aumentoCadaM2 = 40;
	public static int aumentoPorM2 = 50;
	public int codigoPostal; 
	public static int codigoMadrid = 100;
	public static int fueraMadrid = 200;
	public String direccion;
	public String propetario;
	public static int numeroObjetos = 0;
	
	public Apartamento(int m2, int codigoPostal, String direccion, String propetario) {
		this.m2 = m2;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.propetario = propetario;
		numeroObjetos++;
		}
	public void printInfo() {
		System.out.println("La APARTAMENTO a alquilar está en " + direccion + " de código postal " + String.format("%05d", codigoPostal)
				+ ". El propietario es " + propetario + " y el tamaño es de " + m2 + " m2.");
	}
	public int alquierFinal() {
		if (codigoPostal - 28000 >= 0 && codigoPostal - 28000 < 1000) {
			return (precio + (m2 / aumentoCadaM2) * aumentoPorM2 + codigoMadrid);
		} else {
			return (precio + (m2 / aumentoCadaM2) * aumentoPorM2 - fueraMadrid);
		}
	}
	/*Tambien se prodria haber hecho todo en el construcor y el metodo alquiler final quitarlo;
	 * 
	 * 	public Casa(int m2, int codigoPostal, String direccion, String propetario) {
		this.m2 = m2;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.propetario = propetario;
		if (codigoPostal - 2800 >= 0 && codigoPostal - 2800 < 1000) {
			this.precio += ((m2 / aumentoCadaM2) * aumentoPorM2 + codigoMadrid);
		} else {
			this.precio += ((m2 / aumentoCadaM2) * aumentoPorM2 - fueraMadrid);
		}

	}
	public int alquierFinal() {
		return precio;
	}
	 */

	}

