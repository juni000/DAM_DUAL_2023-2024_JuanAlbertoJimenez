package tiendasCarrefur;

public final class Supermercado extends Tienda {

	public int seccionesS = 0;

	public Supermercado(int seccionesS) {
		super();
		this.seccionesS = seccionesS;
	}

	@Override
	public void empleadosSeccion() {
		System.out.println("Tienda tipo Supermercado. Empleados: " + this.empleados + " Secciones: " + this.seccionesS
				+ " Empleados Por Seccion: " + this.empleados / this.seccionesS);
	}

}
