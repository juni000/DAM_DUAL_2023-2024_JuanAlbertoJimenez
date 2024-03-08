package sincronizacion2;

public class SacarDinero extends Thread{
	private Cuenta c;
	public SacarDinero(String n, Cuenta c) {
		super(n);
		this.c=c;
	}
	public void run() {
		for (int i = 0; i < 4; i++) {
			c.retirarDinero(10, getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
}
