
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anaibislopezvara
 */
public class VentanaInicio extends javax.swing.JFrame {

    public VentanaTabla ventanaTabla;
    public Boolean inicio=true;
    private String nombre, apellidos, edad;

    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(VentanaInicio.MAXIMIZED_BOTH);
        InicializarAyuda();
    }
    
    private void InicializarAyuda(){
        try {
            //Cargar el fichero de configuración principal de la ayuda (help_set.hs)
            File fichConfig = new File ("src/help/help_set.hs");
            
            //Se genera la URL que representa la ubicación del archivo de ayuda
            //en la estructura de archivos del sistema
            URL urlConfig = fichConfig.toURI().toURL();
            
            //Generar la ayuda creando el HelpSet y el HelpBroker
             HelpSet helpSet = new HelpSet(getClass().getClassLoader(), urlConfig);                                                                                                                                    

            //Crear la instancia del HelpBroker
            HelpBroker helpBrok = helpSet.createHelpBroker();
            
            // Se indica la páguna que se debe abrir si se pulsa el botón AYUDA
            helpBrok.enableHelpOnButton(jButtonAYUDA, "aplicacion", helpSet);
            
            // Se indica la páguna que se debe abrir si se pulsa la tecla F1
            helpBrok.enableHelpKey(this.getContentPane(), "ventana principal", helpSet);
            
            
        } catch (MalformedURLException | HelpSetException ex) {
            Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonINSERTAR = new javax.swing.JButton();
        jButtonLIMPIAR = new javax.swing.JButton();
        jButtonFINALIZAR = new javax.swing.JButton();
        jTextFieldNOMBRE = new javax.swing.JTextField();
        jTextFieldEDAD = new javax.swing.JTextField();
        jTextFieldAPELLIDOS = new javax.swing.JTextField();
        jButtonAYUDA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA INICIO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Edad");

        jButtonINSERTAR.setText("INSERTAR");
        jButtonINSERTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSERTARActionPerformed(evt);
            }
        });

        jButtonLIMPIAR.setText("LIMPIAR");
        jButtonLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLIMPIARActionPerformed(evt);
            }
        });

        jButtonFINALIZAR.setText("FINALIZAR");
        jButtonFINALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFINALIZARActionPerformed(evt);
            }
        });

        jButtonAYUDA.setText("AYUDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAPELLIDOS, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonINSERTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFINALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonAYUDA)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAPELLIDOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonINSERTAR)
                    .addComponent(jButtonLIMPIAR)
                    .addComponent(jButtonFINALIZAR)
                    .addComponent(jButtonAYUDA))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonINSERTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSERTARActionPerformed
       if (inicio) {  
     //if (ventanaTabla==null) {  
         ventanaTabla = new VentanaTabla(this,false);
            inicio=false;
            ventanaTabla.inicializarTabla();
            ventanaTabla.setVisible(true);
      }
        nombre = jTextFieldNOMBRE.getText();
        apellidos = jTextFieldAPELLIDOS.getText();
        edad = jTextFieldEDAD.getText();
        ventanaTabla.insertarDatos(nombre, apellidos, edad);
        this.limpiarCampos();
    }//GEN-LAST:event_jButtonINSERTARActionPerformed

    private void limpiarCampos() {
        jTextFieldNOMBRE.setText("");
        jTextFieldAPELLIDOS.setText("");
        jTextFieldEDAD.setText("");
    
    }
            
    private void jButtonLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLIMPIARActionPerformed
              this.limpiarCampos();
    }//GEN-LAST:event_jButtonLIMPIARActionPerformed

    private void jButtonFINALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFINALIZARActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFINALIZARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAYUDA;
    private javax.swing.JButton jButtonFINALIZAR;
    private javax.swing.JButton jButtonINSERTAR;
    private javax.swing.JButton jButtonLIMPIAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldAPELLIDOS;
    private javax.swing.JTextField jTextFieldEDAD;
    private javax.swing.JTextField jTextFieldNOMBRE;
    // End of variables declaration//GEN-END:variables
}
