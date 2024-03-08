package ejer1;

public class Sumatorio extends Thread{
	private double resultado;
	private int numero;
	public Sumatorio(int numero) {
		this.numero=numero;
	}
	
	
	public double getResultado() {
		return resultado;
	}


	public void setResultado(double resultado) {
		this.resultado = resultado;
	}


	@Override
	public void run() {
		double suma = 0;
		for (int i = numero; i >=1; i--) {
			suma+=i;
		}
		resultado = suma;
	}
	

}
