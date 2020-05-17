/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Acceso {
    
    
    
     private String nombre;
     private int cantidad;
     private int codigo;

     private String tv;
     private String radio;
     private String tostadora;

    public Acceso(String nombre, int cantidad, int codigo, String tv, String radio, String tostadora) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.tv = tv;
        this.radio = radio;
        this.tostadora = tostadora;
    }

    public String getTostadora() {
        return tostadora;
    }

    public void setTostadora(String tostadora) {
        this.tostadora = tostadora;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
     
     
    
}
