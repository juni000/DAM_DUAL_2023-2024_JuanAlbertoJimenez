package electrodomesticos;

public class Lavadora  extends Electrodomesticos{
	protected int carga= 5;

	public Lavadora(int peso,int carga) {
		super(peso);
		this.carga = carga;
	}


	public Lavadora(char consumoEnergetico, int peso, int carga) {
		super(consumoEnergetico, peso);
		this.carga = carga;
	}


	@Override
	protected int precioFinal() {
		int precio = super.precioFinal();
		if (this.carga > 30) {
			precio +=50;
		}
		return precio;
	}
	
	
	
}
