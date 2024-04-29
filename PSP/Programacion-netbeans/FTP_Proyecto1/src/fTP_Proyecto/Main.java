/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fTP_Proyecto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author LABORATORIOS
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FTPClient ftp = new FTPClient();
        String server = "172.16.1.53";
        ftp.connect(server, 21);
        System.out.println(ftp.getReplyString());
        System.out.println(ftp.isConnected());
        String user = "juan";
        String pass = "juan";
        System.out.println("Vamos a logearnos....");
        if (!ftp.login(user, pass)) System.out.println("Usuario y contraseña incorrecto");
        else {
            System.out.println("Te has conectado.");
            System.out.println("Directorio actual: " + ftp.printWorkingDirectory());
            //FTPFile[] files = ftp.listFiles();
            //System.out.println("Nº de ficheros: " + files.length);
            //ftp.makeDirectory("pruebaaaaaaaa");
                    
            /*for (FTPFile file : files) {
                System.out.println(file.toString());
            }*/
            System.out.println("Vamos a subir un fichero.");
            //InputStream fich = new FileInputStream("D:\\xtzqbsv5slw81.jpg");
            //ftp.storeFile("Foto.jpg",fich);
            System.out.println("Vamos a bajar un fichero.");
            //OutputStream fichs = new FileOutputStream("hola.txt");
            //ftp.retrieveFile("alumnos.txt", fichs);
            System.out.println("Vamos a borrar un fichero.");
            //ftp.deleteFile("Foto.jpg");
            System.out.println("Vamos a modificar el nombre de un fichero.");
            ftp.rename("alumnnos.txt", "alumnossssss.txt");
        }
        
        
        
        
        ftp.disconnect();
    }
}
