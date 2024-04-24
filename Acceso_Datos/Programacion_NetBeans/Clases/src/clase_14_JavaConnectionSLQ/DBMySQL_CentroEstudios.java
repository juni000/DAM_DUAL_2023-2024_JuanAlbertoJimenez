/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_14_JavaConnectionSLQ;

import com.mysql.jdbc.Driver;
import java.sql.*;
/**
 *
 * @author LABORATORIOS
 */
public class DBMySQL_CentroEstudios {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Cargar el driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Establecer la conexion con la base de datos
        String server = "jdbc:mysql://localhost/centroestudios?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        
        Connection conex = DriverManager.getConnection(server,user,password);
        Statement consult = conex.createStatement();
        
        //ejecutar la consulta
        String sql = "select * from profesor";
        ResultSet resultado = consult.executeQuery(sql);
        while (resultado.next()) {
            System.out.println("Nombre: " + resultado.getString("nombre")+" " + resultado.getString("apellido") + "\tEmail: " + resultado.getString("email"));
        }
        resultado.close();
        consult.close();
        conex.close();
    }
}
