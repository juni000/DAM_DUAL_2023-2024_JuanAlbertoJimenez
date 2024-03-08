package viviendas;

public abstract class Vivienda {
	public int m2;
	public int codigoPostal;
	public String direccion;
	public String propetario;
	public String nombre = String.format("VIV%03d", numeroObjetos);
	public static int numeroObjetos= 0;
	public final int precio = 0;
	public final int aumentoCadaM2 = 1;
	public final int aumentoPorM2 = 1;
	public final int codigoMadrid = 0;
	public final int fueraMadrid = 0;
	
	Vivienda(int m2, int codigoPostal, String direccion, String propetario){
		this.m2 = m2;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
		this.propetario = propetario;
		numeroObjetos++;
	}

	public void printInfo() {
		System.out.println("La/El "+ this.getClass().toString().substring(16) + " " + nombre + " a alquilar está en " + direccion + " de código postal "
				+ String.format("%05d", codigoPostal) + ". El propietario es " + propetario + " y el tamaño es de " + m2
				+ " m2.");
		
	}

	public abstract int alquierFinal();

}
