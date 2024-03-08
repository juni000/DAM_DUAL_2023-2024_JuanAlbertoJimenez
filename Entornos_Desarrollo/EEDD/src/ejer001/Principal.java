package ejer001;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Book l1 = new Book();
		
		l1.setTitulo("si");
		l1.setNumpag(456);
		l1.setisbn("asdf2234");
		
		System.out.println("Titulo: " + l1.getTitulo());
		System.out.println("Paginas: " + l1.getNumpag());
		System.out.println("ISBN: " + l1.getisbn());
		
		Book l2 = new Book("El arte de la guerra","werewr",3);
		
		System.out.println("Titulo: " + l2.getTitulo());
		System.out.println("Paginas: " + l2.getNumpag());
		System.out.println("ISBN: " + l2.getisbn());
		
		Book l3 = new Book("Últimos deias en Berlín","asd",590);
		l3.visualizar();
		
		
		}
	
}
