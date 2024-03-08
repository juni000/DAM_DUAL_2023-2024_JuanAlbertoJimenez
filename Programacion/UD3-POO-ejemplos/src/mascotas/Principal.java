package mascotas;

public class Principal {

	public static void main(String[] args) {
		// Instanciar Objetos de la Class Perro

		Perros mastin = new Perros("Mastín Napolitano", "Grande", 5, "Negro");
		System.out.println(mastin.darInformacion());
		/*
		 * mastin.setRaza(" Mastín Napolitano"); mastin.setTamano("Grande");
		 * mastin.setEdad(5); mastin.setColor("Negro");
		 */
		System.out.println("El tamaño del Mastín es: " + mastin.getTamano());
		mastin.dormir(4);
		
		//Se tiñe el perro
		mastin.setColor("Azul");
		System.out.println(mastin.darInformacion());
				
		Perros maltes = new Perros();
		maltes.setRaza ("Maltés");
		maltes.setTamano ("Pequeño"); maltes.setEdad(2);
		maltes.setColor("Blanco");
		
		System.out.println("El tamaño del Maltés es: " + maltes.getTamano());
		maltes.dormir(2);
		Perros pequines = new Perros("Pequinés", 2);
		System.out.println(pequines.darInformacion());
	}

}
