package viviendas;

import java.util.ArrayList;

public class AlquilerViviendas {
	public static void main(String[] args) {
		ArrayList<Vivienda> viviendas = new ArrayList<Vivienda>();

		
		//casas
		viviendas.add(new Casa(580 ,29414,"C/Ribadeo 23","Anabel Alonso"));
		viviendas.add(new Casa(380,28004,"Av. Los Toreros","Luis Granda"));
		//apartamentos
		viviendas.add(new Apartamento(120 ,28045,"C/General Lazi 34 4D","Luis Granda"));
		viviendas.add(new Apartamento(90 ,33045,"C/Alberto Ruiz","Anabel Alonso"));
		viviendas.add(new Apartamento(80 ,28004,"C/Goya 13","Luis Granda"));
		//Locales
		viviendas.add(new Local(1200 ,40045,"Avenida las heras","Urb."));
		
		System.out.println("\n\t\t*** ALQUILER DE VIVIENDAS ****\n");
		/*for (int i = 0; i < viviendas.size(); i++) {	
			viviendas.get(i).printInfo();
			if (viviendas.get(i) instanceof Casa) {
				System.out.println("Precio alquiler final: " +((Casa) viviendas.get(i)).alquierFinal());
			}else if (viviendas.get(i) instanceof Apartamento) {
			System.out.println("Precio alquiler final: " +((Apartamento) viviendas.get(i)).alquierFinal());
			}else if (viviendas.get(i) instanceof Local) {
				System.out.println("Precio alquiler final: " +((Local) viviendas.get(i)).alquierFinal());
		}
		}*/
		for (Vivienda vivienda : viviendas) {
			vivienda.printInfo();
			System.out.println("Precio alquiler final: " + vivienda.alquierFinal() + "\n");
		}
		System.out.println("Número de apartamentos alquilados: "+ Apartamento.numeroObjetos);
		System.out.println("Número de casas alquiladas: "+ Casa.numeroObjetos);
		System.out.println("Número de locales alquilados: "+ Local.numeroObjetos);
		System.out.println("Número de viviendas alquilados:" + Vivienda.numeroObjetos);
	}
}
