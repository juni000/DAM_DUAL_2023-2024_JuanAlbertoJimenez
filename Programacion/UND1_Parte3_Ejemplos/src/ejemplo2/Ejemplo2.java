package ejemplo2;

public class Ejemplo2 {

	public static void main(String[] args) {
		int pepe=5, paco=2, luis=1;
		boolean res1=false, res2=false, fin =false;
		pepe= pepe + 7; //pepe=12
		res1 = ((pepe!=paco)&&(pepe!=luis))||(paco==luis); //res1 = true
		luis--; //luis=0
		res2 = (pepe>=paco)^(luis!=pepe); //res2=false
		fin = !res1 && !res2;
		System.out.println("El resultado es: "+ fin);

	}

}
