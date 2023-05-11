/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.daos;

import java.sql.*;

/**
 *
 * @author abhisanna
 */
public class Koneksi {
    public static Connection kon;
    
    private static final String URL = "jdbc:mysql://localhost:3306/dbakademik";
    private static final String DRIVERNAME = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection bukaKoneksi() {
        if(kon == null) {
            try {
                Class.forName(DRIVERNAME);
                try {
                    kon = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                }
                catch(SQLException sqle) {
                    System.out.println("Tidak terhubung ke database: " + sqle);
                }
            }   
            
            catch(ClassNotFoundException e) {
                System.out.println("Driver not found: " + e);
            }   
        }
        
        return kon;
    }
    
    public static Connection tutupKoneksi() {
        if(kon != null) {
            try {
                kon.close();
            } catch(SQLException e) {
                System.out.println("Error: " + e);
            }
        }
        
        return kon;
    }
    
    public static void main(String[] args) {
        new Koneksi();
    }
}
