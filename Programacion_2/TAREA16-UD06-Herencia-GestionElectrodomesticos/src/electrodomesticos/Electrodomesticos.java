package electrodomesticos;

public class Electrodomesticos {
	protected int precioBase = 100;
	protected char consumoEnergetico = 'D';
	protected int peso = 5;
	protected static int numeroElectrodomesticos = 0;

	public Electrodomesticos() {
		numeroElectrodomesticos++;
	}

	public Electrodomesticos(int peso) {
		this.peso = peso;
		numeroElectrodomesticos++;
	}

	public Electrodomesticos(char consumoEnergetico, int peso) {
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		numeroElectrodomesticos++;
	}

	protected boolean comprobarConsumoEnergetico() {
		if ((int) Character.toUpperCase(consumoEnergetico) > 64 && (int) Character.toUpperCase(consumoEnergetico) < 69) {
			return true;
		} else {
			return false;
		}
	}
	
	protected int precioFinal() {
		int i = 0;
		switch (Character.toUpperCase(this.consumoEnergetico)) {
		case 'A':
			i = 100;
			break;
		case 'B':
			i = 80;
			break;
		case 'C':
			i = 60;
			break;
		case 'D':
			i = 40;
			break;

		default:
			break;
		}
		return this.precioBase + ((this.peso / 10 ) * 30) + i;
	}

}
