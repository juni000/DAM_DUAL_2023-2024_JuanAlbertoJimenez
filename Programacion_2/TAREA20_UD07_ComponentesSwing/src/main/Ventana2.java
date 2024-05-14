package main;

import javax.swing.JFrame;

public class Ventana2 extends JFrame{
	Ventana2(int ancho, int alto){
		this.setBounds((int) ancho/3,0,(int) ancho/3,(int)alto/2);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Ventana2");
		
		
		
		this.setVisible(true);
	}
}
