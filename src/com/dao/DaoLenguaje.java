
package com.dao;

import com.conexion.Conexion;
import com.modelo.Lenguaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *  Nombre de la clase: DaoLenguaje
 *  Fecha: 11/6/2020
 *  Versión: 1.0
 * Copyright: Leonel López
 * @author Leonel
 */
public class DaoLenguaje extends Conexion{
    public List<Lenguaje> mostrarLenguajes(){
        List listaLenguajes = new ArrayList();
        ResultSet res;
        
        try {
            this.conectar();
            String sql = "select * from lenguajes";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while(res.next()){
                Lenguaje leng = new Lenguaje();
                leng.setIdLenguaje(res.getInt("id_lenguaje"));
                leng.setNombre(res.getString("nombre"));
                leng.setValor(res.getDouble("valor"));
                listaLenguajes.add(leng);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al extraer lenguajes: "+e.getMessage(), "Error", 0);
        } finally {
            this.desconectar();
        }
        return listaLenguajes;
    }
}
