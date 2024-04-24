package tiendasCarrefur;

public abstract class Tienda {

	public int empleados = 50;
	public int metros2 = 200;
	public static int numTiendas = 0;
	
	public Tienda(){
		numTiendas++;
	}
	
	public abstract void empleadosSeccion(); 
	
}
