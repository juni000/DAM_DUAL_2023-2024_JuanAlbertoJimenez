package vivendas;

public class Vivienda {
	public int m2;
	public int codigoPostal;
	public String direccion;
	public String propetario;
	public final int precio = 0;
	public final int aumentoCadaM2 = 0;
	public final int aumentoPorM2 = 0;
	public final int codigoMadrid = 0;
	public final int fueraMadrid = 0;
	
	Vivienda(int m2, int codigoPostal, String direccion, String propetario){
		this.m2 = m2;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.propetario = propetario;
	}

	public void printInfo() {
		System.out.println("La vivienda a alquilar está en " + direccion + " de código postal "
				+ String.format("%05d", codigoPostal) + ". El propietario es " + propetario + " y el tamaño es de " + m2
				+ " m2.");
	}

	public int alquierFinal() {
		if (this.codigoPostal - 28000 >= 0 && this.codigoPostal - 28000 < 1000) {
			return (this.precio + (this.m2 / this.aumentoCadaM2) * this.aumentoPorM2 + this.codigoMadrid);
		} else {
			return (this.precio + (this.m2 / this.aumentoCadaM2) * this.aumentoPorM2 - this.fueraMadrid);
		}
	}

}
