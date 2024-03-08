package sistemaElectrico;

public class Consumo {
	// atributos
	private double kms;
	private double litros;
	private double vmed;
	private static double pgas = 1.3;
	private static int numobj;

	// Constructores
	public Consumo() {
		this.kms = 0.10;
		this.litros = 0.1;
		this.vmed = 0.5;
		Consumo.numobj++;
	}

	public Consumo(double kms, double litros, double vmed) {
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		Consumo.numobj++;
	}

	// Métodos
	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getVmed() {
		return vmed;
	}

	public void setVmed(double vmed) {
		this.vmed = vmed;
	}
	public static double getPgas() {
		return pgas;
	}

	public static void setPgas(double pgas) {
		Consumo.pgas = pgas;
	}
	public static int getnumobj() {
		return Consumo.numobj;
	}


	public double tiempo() {
		return (kms / vmed);
	}

	public double consumoMedio() {
		return (litros / (kms / 100));
	}

	public double consumoEuros() {
		return (Consumo.pgas*consumoMedio());
	}
	public void getInfo() {
		System.out.println("Consumo con Kms: " + kms + " Vmed: " + vmed + " litros: " + litros + " precio gas: " + Consumo.pgas);
	}

}
