package electrodomesticos;

public class Televisor extends Electrodomesticos{
	protected int resolucion  =20;

	public Televisor(char consumoEnergetico, int peso,int resolucion) {
		super(consumoEnergetico, peso);
		this.resolucion = resolucion;
	}

	public Televisor(int peso,int resolucion) {
		super(peso);
		this.resolucion = resolucion;
	}

	@Override
	protected int precioFinal() {
		int precio = super.precioFinal();
		if (this.resolucion>40) {
			precio += 30;
		}
		return precio;
	}
	
}
