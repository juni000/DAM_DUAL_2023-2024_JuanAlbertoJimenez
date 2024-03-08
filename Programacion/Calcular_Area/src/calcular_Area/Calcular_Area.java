package calcular_Area;

public class Calcular_Area {
	
	final static double PI = 3.14159265;
	
	public static void main(String[] args) {
		
		int radio = 3;
		float area = 0;
		
		area = (float ) PI * radio * radio ;
		System.out.println("El área del círculo de radio " + radio + " es =" + area);
		
	}

}
