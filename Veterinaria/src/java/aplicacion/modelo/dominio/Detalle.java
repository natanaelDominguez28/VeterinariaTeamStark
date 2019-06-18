/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author natanael
 */
public class Detalle implements Serializable {
    private int codigo;
    private String producto;
    private int cantidad;
    private double precio;
    private boolean estado;

    /**
     * Constructor parametrizado
     * @param codigo
     * @param producto
     * @param cantidad
     * @param precio
     * @param estado 
     */
    public Detalle(int codigo, String producto, int cantidad, double precio, boolean estado) {
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    //Constructor vacío
    public Detalle() {
    }
    
    /**
     * método que obtiene el precio total
     * @return la cantidad por el precio
     */
    public double obtenerTotal(){
        return this.cantidad * this.precio;
    }

    //Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
