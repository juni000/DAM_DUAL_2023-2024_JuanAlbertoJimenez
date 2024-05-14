package main;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class Ventana1 extends JFrame {
	// ToolKit para obtener el screen
	Ventana1(int ancho, int alto, File fichero) throws IOException {
		this.setBounds(0, 0, (int) ancho / 3, alto);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Ventana1");

		Lamina1 Lamina1 = new Lamina1(fichero);
		this.add(Lamina1);

		this.setVisible(true);
	}

}

class Lamina1 extends JPanel {
	JLabel jl;
	JTextArea ta;

	Lamina1(File fichero) throws IOException {
		jl = new JLabel("Primera Etiqueta");
		this.add(jl);
		
		ta = new JTextArea(30,30);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String cadena;
			while ((cadena = br.readLine()) != null) {
				ta.append(cadena);
				ta.setLineWrap(true);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ta.append("Hola Caracora");
		this.add(ta);
	}

}
