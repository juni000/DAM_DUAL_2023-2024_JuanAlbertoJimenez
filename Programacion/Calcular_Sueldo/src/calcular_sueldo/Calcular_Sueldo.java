package calcular_sueldo;

public class Calcular_Sueldo {

	public static void main(String[] args) {
		
		float horas = 0, pago_horas = 0 ;
		float sueldo = 0;
		
		horas = 40;
		pago_horas = (float) 12.66;
		
		sueldo = horas * pago_horas;
		System.out.println("Tu sueldo habiendo trabajado " + (int) horas + " horas y cobrando " + (int) pago_horas + "€ la hora, tu sueldo es = " + sueldo + "€");
		
	}

}
