/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_16Stament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

/**
 *
 * @author LABORATORIOS
 */
public class ClientesPreparedStament {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Cargar el driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Establecer la conexion con la base de datos
        String server = "jdbc:mysql://localhost/ventas?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        
        Scanner teclado = new Scanner(System.in);
        
        
        Connection conex = DriverManager.getConnection(server,user,password);
        
        String sql = "select c.nombre,c.apellido1,c.apellido2,p.fecha,p.total from pedido p join cliente c on p.id_cliente=c.id where year(p.fecha)=? and p.total>?";
        PreparedStatement consult = conex.prepareStatement(sql);
        
        //ejecutar la consulta
        int total = 0;
        System.out.println("Introduzca el total: ");
        total = teclado.nextInt();
        
        int fecha = 0;
        System.out.println("Introduzca la fecha: ");
        fecha = teclado.nextInt();
        
        
        consult.setInt(1, fecha);
        consult.setInt(2, total);
         
        System.out.println(consult);
        
        ResultSet resultado = consult.executeQuery();
        
        while (resultado.next()) {
            System.out.println("Nombre: " + resultado.getString("nombre") + " Apellidos: " + resultado.getString("apellido1") + " " + resultado.getString("apellido2") + " Fecha:" + resultado.getString("fecha") + " Total: " + resultado.getString("total"));
            
        }
        


        consult.close();
        conex.close();
    }
}
