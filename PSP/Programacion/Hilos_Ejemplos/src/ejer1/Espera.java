package ejer1;

public class Espera extends Thread{
	private int tiempo;
	public Espera(int tiempo) {
		this.tiempo=tiempo;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
