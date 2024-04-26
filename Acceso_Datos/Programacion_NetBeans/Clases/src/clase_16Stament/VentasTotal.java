/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_16Stament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author LABORATORIOS
 */
public class VentasTotal {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Cargar el driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Establecer la conexion con la base de datos
        String server = "jdbc:mysql://localhost:3305/ventas?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        
        Scanner teclado = new Scanner(System.in);
        
        
        Connection conex = DriverManager.getConnection(server,user,password);
        
        String sql = "select sum(total) from pedido where year(fecha)=?";
        PreparedStatement consult = conex.prepareStatement(sql);
        
        //ejecutar la consulta
        int anno = 0;
        System.out.println("Introduzca el año para saber el numero de ventas del mismo: ");
        anno = teclado.nextInt();
        
        consult.setString(1, String.valueOf(anno));
        //consult.setInt(1, anno);
        
        
        ResultSet resultado = consult.executeQuery();
        
        
        
        resultado.next();
        double total = resultado.getDouble("sum(total)");
        if (total!=0) {
            System.out.println("Importe total año "+anno+": " + total);
        }else{
            System.out.println("No hay ventas en " + anno);
        }
        

        resultado.close();
        consult.close();
        conex.close();
    }
        
}
