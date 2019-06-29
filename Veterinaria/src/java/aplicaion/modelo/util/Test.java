/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaion.modelo.util;

import java.io.Serializable;

/**
 *clase test para probar no es tan elemental
 * @author pc
 * carolina
 */
public class Test implements Serializable {
    
    private String fecha;
    private String producto;
    private int cantidad;
    private Double precio;

   
    
    
    
    
    public Test(String fecha, String producto, int cantidad, Double precio) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

   
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
    
    
}
