package gestionAulas;

public class Informatica extends Aula {

	private int pcs = 0;
	public String codigo = "";
	public static int numeroAulas = 0;
	
	Informatica (int alumnos){
		super(alumnos);
		this.setMagnitud((int)(this.getMagnitud() * 1.2));
		this.pcs = (int)(this.getMagnitud()/2);
		this.codigo = String.format("I%04d", Informatica.numeroAulas);
		Informatica.numeroAulas++;
    }
	Informatica (int alumnos, int pcs){
		super(alumnos);
		this.pcs = pcs;
		this.codigo = String.format("I%04d", Informatica.numeroAulas);
		Informatica.numeroAulas++;
    }
	 
	 public boolean limiteCapacidad() {
		 if (pcs >= this.getUsuarios()) {
			 return false;
		 }
		 else return true;
	 }
	 
	 public void avisoExcesoCapacidad() {
	   if (this.limiteCapacidad()) 
		System.out.println("***Cuidado, ha superado la capacidad máxima del aula INFORMÁTICA ***");
     }
	 
	 public void imprimirInfo() {
		 System.out.println("Aula Informática [" + codigo + "] => Magnitud: " 
		 		+ this.getMagnitud() + " => Usuarios: " + this.getUsuarios() + " => PCs: " + pcs);
	 }
}