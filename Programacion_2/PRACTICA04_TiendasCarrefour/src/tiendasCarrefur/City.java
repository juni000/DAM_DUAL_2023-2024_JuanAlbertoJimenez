package tiendasCarrefur;

public final class City extends Tienda {
	
	public int seccionesC = 0;
	
	public City(int seccionesC) {
		super();
		this.seccionesC = seccionesC;
		this.empleados = this.empleados / 2;
		this.metros2 = this.metros2 / 2;
	}

	@Override
	public void empleadosSeccion() {
		System.out.println("Tienda tipo City. Empleados: " + this.empleados + " Secciones: " + this.seccionesC
				+ " Empleados Por Seccion: " + this.empleados / this.seccionesC);
	}

}
