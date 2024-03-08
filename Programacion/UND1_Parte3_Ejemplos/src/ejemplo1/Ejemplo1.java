package ejemplo1;

public class Ejemplo1 {

	public static void main(String[] args) {
		int m=2, n=5;
		boolean res;
		
		res = m > n; //res=false
		System.out.println("El resultado de " + m + " > " + n + " es " + res);
		
		res = m < n; //res=true
		System.out.println("El resultado de " + m + " < " + n + " es " + res);
		
		res = m >= n; //res=false
		System.out.println("El resultado de " + m + " >= " + n + " es " + res);
		
		res = m <= n; //res=true
		System.out.println("El resultado de " + m + " <= " + n + " es " + res);
		
		res = m == n; //res=false
		System.out.println("El resultado de " + m + " = " + n + " es " + res);
		
		res = m != n; //res=true
		System.out.println("El resultado de " + m + " != " + n + " es " + res);
		
		res =m > n && m >= n; //res=false
		System.out.println("El resultado de " + m + " > " + n + " y " + m + " >= " + n + " es " + res);

		res =!(m < n || m != n); //res=false
		System.out.println("El resultado es difenrente de " + m + " < " + n + " o " + m + " != " + n + " es " + res);
	
		System.out.println("La variable m es: " + m);
		System.out.println("La variable n es: " + n);
		System.out.println("Cambiamos m++ " + (m++) + " y preguntamos de nuevpor m: " + m);


	}

}
