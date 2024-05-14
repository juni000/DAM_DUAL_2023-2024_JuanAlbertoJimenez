package main;

import javax.swing.JFrame;

public class Ventana4 extends JFrame{
	Ventana4(int ancho, int alto){
		this.setBounds((int) ancho/3,(int)alto/2,(int) (2*ancho/3),alto/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ventana4");
		
		
		
		this.setVisible(true);
	}
}
