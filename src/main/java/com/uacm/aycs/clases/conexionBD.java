package com.uacm.aycs.clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author joel-
 */
public class conexionBD 
{
    
    public static Connection conectar()
    {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hospital privado", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e);
        }
        return (null);
    }
}