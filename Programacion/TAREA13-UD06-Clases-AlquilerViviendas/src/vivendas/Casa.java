package vivendas;

public class Casa extends Vivienda {
	public final int precio = 800;
	public final int aumentoCadaM2 = 50;
	public final int aumentoPorM2 = 100;
	public final int codigoMadrid = 300;
	public final int fueraMadrid = 150;
	public static int numeroObjetos = 0;

	public Casa(int m2, int codigoPostal, String direccion, String propetario) {
		super(m2, codigoPostal, direccion, propetario);
		numeroObjetos++;
	}
	@Override
	public int alquierFinal() {
		if (this.codigoPostal - 28000 >= 0 && this.codigoPostal - 28000 < 1000) {
			return (this.precio + (this.m2 / this.aumentoCadaM2) * this.aumentoPorM2 + this.codigoMadrid);
		} else {
			return (this.precio + (this.m2 / this.aumentoCadaM2) * this.aumentoPorM2 - this.fueraMadrid);
		}
	}
}
