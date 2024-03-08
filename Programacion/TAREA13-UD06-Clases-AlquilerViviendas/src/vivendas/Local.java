package vivendas;

public class Local extends Vivienda {
	public final int precio = 100;
	public final int aumentoCadaM2 = 100;
	public final int aumentoPorM2 = 100;
	public final int codigoMadrid = 200;
	public final int fueraMadrid = 100;
	public static int numeroObjetos = 0;

	public Local(int m2, int codigoPostal, String direccion, String propetario) {
		super(m2, codigoPostal, direccion, propetario);
		numeroObjetos++;
	}
}
