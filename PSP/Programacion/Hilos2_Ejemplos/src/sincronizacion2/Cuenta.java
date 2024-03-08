package sincronizacion2;

public class Cuenta {
	private int saldo;
	Cuenta(int s){
		saldo = s;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	private void restar(int cant) {
		saldo = saldo - cant;
	}
	public void retirarDinero(int cant, String name) {
		if (getSaldo() >= cant) {
			
		}
	}
}
