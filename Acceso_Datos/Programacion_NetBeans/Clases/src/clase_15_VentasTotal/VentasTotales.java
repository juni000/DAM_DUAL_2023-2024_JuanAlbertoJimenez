/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_15_VentasTotal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LABORATORIOS
 */
public class VentasTotales {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Cargar el driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Establecer la conexion con la base de datos
        String server = "jdbc:mysql://localhost/ventas?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        
        Connection conex = DriverManager.getConnection(server,user,password);
        Statement consult = conex.createStatement();
        
        //ejecutar la consulta
        int anno = 2016;
        String sql = "select sum(total) from pedido where year(fecha) =" + anno;
        ResultSet resultado = consult.executeQuery(sql);
        
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
