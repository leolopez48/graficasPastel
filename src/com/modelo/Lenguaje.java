
package com.modelo;

/**
 *  Nombre de la clase: Lenguaje
 *  Fecha: 11/6/2020
 *  Versión: 1.0
 * Copyright: Leonel López
 * @author Leonel
 */
public class Lenguaje {
    private int idLenguaje;
    private String nombre;
    private double valor;

    public Lenguaje(int idLenguaje, String nombre, double valor) {
        this.idLenguaje = idLenguaje;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Lenguaje() {
    }

    public int getIdLenguaje() {
        return idLenguaje;
    }

    public void setIdLenguaje(int idLenguaje) {
        this.idLenguaje = idLenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
