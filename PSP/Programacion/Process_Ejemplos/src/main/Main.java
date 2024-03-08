package main;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println(".");
		int salida = JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(salida);
		String ruta = JOptionPane.showInputDialog("Escribe un ejecutable: ","calc.exe");
		ProcessBuilder p = new ProcessBuilder(ruta);
		p.start();
		}

}
