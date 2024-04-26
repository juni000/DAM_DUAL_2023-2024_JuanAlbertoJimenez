/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_16Stament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author LABORATORIOS
 */
public class EliminarPedidos {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Cargar el driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Establecer la conexion con la base de datos
        String server = "jdbc:mysql://localhost/ventas?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        
        Scanner teclado = new Scanner(System.in);
        
        
        Connection conex = DriverManager.getConnection(server,user,password);
        
        String sql = "delete from pedido where total < ?";
        PreparedStatement consult = conex.prepareStatement(sql);
        
        //ejecutar la consulta
        int total = 0;
        System.out.println("Introduzca el total para eliminar los registros menores: ");
        total = teclado.nextInt();
        
        consult.setInt(1, total);
        System.out.println(consult);
        
        int resultado = consult.executeUpdate();
        
        if (resultado == 1) {
            System.out.println("Ejecutado con exito");
        }else System.out.println("Algo ha salido mal");
        


        consult.close();
        conex.close();
    }
}
