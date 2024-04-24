/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package Clase_9_Beans;

import java.awt.Graphics;
import java.beans.*;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DAM
 */
public class JPanelImagen extends JPanel implements Serializable {
    
    private File rutaImagen;

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    public JPanelImagen() {
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (rutaImagen != null && rutaImagen.exists()) {
            ImageIcon imagenicon = new ImageIcon(rutaImagen.getAbsolutePath());
            g.drawImage(imagenicon.getImage(), 0, 0, null);
        }
    }
    
    
    
}
