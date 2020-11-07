
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *  Nombre de la clase: Conexion
 *  Fecha: 11/6/2020
 *  Versión: 1.0
 * Copyright: Leonel López
 * @author Leonel
 */
public class Conexion {
    Connection con;
    
    public Connection getCon(){
        return con;
    }
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacion", "root", "");
            return true;
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error al conectar: "+e.getMessage(), "Error", 0);
            return false;
        }
    }
    
    public boolean desconectar(){
        try {
            if(con != null){
                if(con.isClosed() == false){
                     con.close();
                }
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al desconectar: "+e.getMessage(), "Error", 0);
            return false;
        }
    }
}
