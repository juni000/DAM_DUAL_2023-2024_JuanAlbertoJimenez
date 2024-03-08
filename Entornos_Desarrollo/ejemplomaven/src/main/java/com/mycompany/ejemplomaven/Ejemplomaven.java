/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplomaven;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DAM
 */
public class Ejemplomaven {

    public static void main(String[] args) {
        Connection c = null;
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/eedd","root","root");
        System.out.println("Conexion correcta");
    }
}
