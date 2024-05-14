package main;

import javax.swing.JFrame;

public class Ventana3 extends JFrame{
	Ventana3(int ancho, int alto){
		this.setBounds((int)(2*ancho/3),0,(int) ancho/3,(int)alto/2);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Ventana3");
		
		
		
		this.setVisible(true);
	}
}
