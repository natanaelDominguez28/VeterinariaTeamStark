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
public class Producto implements Serializable{
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precioLista;
    private double precioCosto;
    private int stock;
    private boolean estado;

    /**
     * Constructor parametrizado
     * @param codigo
     * @param nombre
     * @param descripcion
     * @param precioLista
     * @param precioCosto
     * @param stock
     * @param estado 
     */
    public Producto(int codigo, String nombre, String descripcion, double precioLista, double precioCosto, int stock, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioLista = precioLista;
        this.precioCosto = precioCosto;
        this.stock = stock;
        this.estado = estado;
    }

    //Constructor vacío
    public Producto() {
    }

    //Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
