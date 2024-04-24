package tiendasCarrefur;

public final class Hipermercado extends Tienda {

	public int seccionesH = 0;

	public Hipermercado(int seccionesH) {
		super();
		this.seccionesH = seccionesH;
		this.empleados = this.empleados * 3;
		this.metros2 = this.metros2 * 3;
	}

	@Override
	public void empleadosSeccion() {
		System.out.println("Tienda tipo Hipermercado. Empleados: " + this.empleados + " Secciones: " + this.seccionesH
				+ " Empleados Por Seccion: " + this.empleados / this.seccionesH);
	}

}
