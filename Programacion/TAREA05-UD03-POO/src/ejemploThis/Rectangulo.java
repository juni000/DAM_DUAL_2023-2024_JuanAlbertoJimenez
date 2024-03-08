package ejemploThis;

public class Rectangulo {
	private int ancho;
	private int alto;
	private static int contadorobj;
	
	public Rectangulo(int ancho,int alto) {
		this.ancho = ancho;
		this.alto = alto;
		Rectangulo.contadorobj++;
	}
	
	public Rectangulo(int lado) {
		this.alto = this.ancho = lado;
		Rectangulo.contadorobj++;
	}
	
	
	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public static int getContadorobj() {
		return contadorobj;
	}
	public static void setContadorobj(int contadorobj) {
		Rectangulo.contadorobj = contadorobj;
	}
	
	public Rectangulo incrmentarAncho(){
		this.ancho++;
		return this;
	}
	
	public void imprimirRect() {
		System.out.println("Ancho: " + ancho + " Alto: " + alto);
	}

}
