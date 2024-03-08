package vivendas;

import java.util.ArrayList;

public class AlquilerViviendas {

	public static void main(String[] args) {
		ArrayList<Casa> casas = new ArrayList<Casa>();
		ArrayList<Apartamento> apartamentos = new ArrayList<Apartamento>();
		ArrayList<Local> locales = new ArrayList<Local>();
		
		//casas
		casas.add(new Casa(580 ,29414,"C/Ribadeo 23","Anabel Alonso"));
		casas.add(new Casa(380,28004,"Av. Los Toreros","Luis Granda"));
		//apartamentos
		apartamentos.add(new Apartamento(120 ,28045,"C/General Lazi 34 4D","Luis Granda"));
		apartamentos.add(new Apartamento(90 ,33045,"C/Alberto Ruiz","Anabel Alonso"));
		apartamentos.add(new Apartamento(80 ,28004,"C/Goya 13","Luis Granda"));
		//Locales
		locales.add(new Local(1200 ,40045,"Avenida las heras","Urb."));
		
		System.out.println("\n\t\t*** ALQUILER DE APARTAMENTOS ****\n");
		for (Apartamento apartamento : apartamentos) {
			apartamento.printInfo();
			System.out.println("Precio alquiler final: " +apartamento.alquierFinal());
		}
		
		System.out.println("\n\t\t*** ALQUILER DE CASAS ****\n");
		for (Casa casa : casas) {
			casa.printInfo();
			System.out.println("Precio alquiler final: " +casa.alquierFinal());
		}
		
		System.out.println("\n\t\t*** ALQUILER DE LOCALES ****\n");
		for (Local local : locales) {
			local.printInfo();
			System.out.println("Precio alquiler final: " +local.alquierFinal());
		}
		System.out.println("Número de apartamentos alquilados: "+ Apartamento.numeroObjetos);
		System.out.println("Número de casas alquiladas: "+ Casa.numeroObjetos);
		System.out.println("Número de locales alquilados: "+ Local.numeroObjetos);

	}

}
