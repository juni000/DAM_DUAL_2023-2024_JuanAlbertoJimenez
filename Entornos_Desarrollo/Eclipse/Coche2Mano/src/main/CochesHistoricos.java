package main;


public class CochesHistoricos extends Coche {
	private int anyos;
	private String paisOrigen;

	public CochesHistoricos(String marca, String modelo, double kilometros, String combustible, String color,
			double precio) {
		super(marca, modelo, kilometros, combustible, color, precio);
	}

	public CochesHistoricos() {
	}

	public CochesHistoricos(String marca, String modelo, double kilometros, double precio) {
		super(marca, modelo, kilometros, precio);
	}

	public CochesHistoricos(String marca, String modelo, double kilometros, String combustible, String color,
			double precio, int anyos, String paisOrigen) {
		super(marca, modelo, kilometros, combustible, color, precio);
		this.anyos = anyos;
		this.paisOrigen = paisOrigen;
	}

}
