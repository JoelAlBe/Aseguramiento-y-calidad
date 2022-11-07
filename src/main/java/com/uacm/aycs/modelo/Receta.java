package com.uacm.aycs.modelo;

import com.uacm.aycs.clases.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase: Receta.
 * Version : Final de psp0.
 * copyright.
 * @author joel-
 */
public class Receta 
{   
    public Receta()
    {
        //Constructor vacio.
    }
    
    //Métodos declarados como modelado de negocio en la clase.
    public int guardarReceta(String fecha, String nombre_completo, String edad, String peso, String talla, String temperatura, String presion, String sexo, String alergias, String indicaciones) throws SQLException
    {
        int flag = 0;
        
        try {
                Connection con = conexionBD.conectar();
                PreparedStatement p = con.prepareStatement("insert into pacientes values(?,?,?,?,?,?,?,?,?,?,?)");
                p.setInt(1, 0);
                p.setString(2, fecha);
                p.setString(3, nombre_completo);
                p.setString(4, edad);
                p.setString(5, peso);
                p.setString(6, talla);
                p.setString(7, temperatura);
                p.setString(8, presion);
                p.setString(9, sexo);
                p.setString(10, alergias);
                p.setString(11, indicaciones);
                p.executeUpdate();
                con.close();
                
                flag = 1;
                
        }catch(Exception e){
            System.err.println("Error al registrar..."+e);
            flag = 0;
        } 
        
        if(flag==1)
        {
            return 1;
        }
        
        else
        {
            return 0;
        }
    }
    
    public int buscarReceta(String noSeguro)
    {
        int flag = 0;
        
        try {
            Connection con = conexionBD.conectar();
            String sql = "SELECT * FROM pacientes WHERE no_seguro = noSeguro";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "no_seguro");
            ResultSet rs = pstmt.executeQuery();
            
            System.out.println("No de colunas: "+rs.getString(2));
            flag = 1;
        } catch (Exception e) {
        }
        
        return flag;
    }
    
    public void eliminarReceta() throws SQLException
    {
        Connection con = conexionBD.conectar();
        PreparedStatement stmt = con.prepareStatement("DELETE FROM pacientes WHERE no_seguro = ? ");
        stmt.setString(0, "");
        stmt.setString(1, "");
        stmt.setString(2, "");
        stmt.setString(3, "");
        stmt.setString(4, "");
        stmt.setString(5, "");
        stmt.setString(6, "");
        stmt.setString(7, "");
        stmt.setString(8, "");
        stmt.setString(9, "");
        stmt.setString(10, "");
        stmt.close();
    }
    
    public void actualizarReceta(String id, String nombre, String edad, String peso, String talla) throws SQLException
    {   
       Connection con = conexionBD.conectar(); 
       PreparedStatement stmt = con.prepareStatement("UPDATE pacientes SET nombre_completo = ?,  edad = ?, peso = ?, talla = ? WHERE no_seguro = ?");
       stmt.setString(3, nombre);
       stmt.setString(4, edad);
       stmt.setString(5, peso);
       stmt.setString(6, talla);
       stmt.executeUpdate();
       stmt.close();
    }  
}