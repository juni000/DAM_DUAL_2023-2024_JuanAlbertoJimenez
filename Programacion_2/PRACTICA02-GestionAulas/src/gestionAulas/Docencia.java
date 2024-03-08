package gestionAulas;

public class Docencia extends Aula{

	public String codigo = "";
	public static int numeroAulas = 0;
	
	Docencia (int alumnos){
		super(alumnos);
		this.setMagnitud((int)(this.getMagnitud() * 1.2));
		this.codigo = String.format("D%04d", Docencia.numeroAulas);
		Docencia.numeroAulas++;
    }
    
	 
	 public boolean limiteCapacidad() {
		 if (this.getMagnitud()/this.getUsuarios() >= 1) {
			 return false;
		 } else return true;
	 }
	 
	 public void avisoExcesoCapacidad() {
	   if (this.limiteCapacidad()) 
		System.out.println("***Cuidado, ha superado la capacidad máxima del aula DOCENCIA ***");
     }
	 
	 public void imprimirInfo() {
		 System.out.println("Aula Docencia [" + codigo + "] => Magnitud: "
				+ this.getMagnitud() + " => Usuarios: " + this.getUsuarios());
	 }
	
}
