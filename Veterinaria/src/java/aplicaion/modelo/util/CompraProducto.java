/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaion.modelo.util;

import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;

/**
 *Clase que se crea para testear el funcionamiento de la compra de producto
 * trayendo todos las variables de la clase producto
 * @author pc
 * carolina
 */
public class CompraProducto implements Serializable{
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private Double subTotal;
    private Double total=0.0;
    private int cantidad;
    private Producto producto;
    private int stock;
    private boolean estado;
    private Double precioCosto;
    
  
      //constructor
     public CompraProducto() {
    }
    
    
    //getters and setters 
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
     private Double precioLista;


    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
   
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
   
    public Double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(Double precioLista) {
        this.precioLista = precioLista;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
  
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }



    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Producto getPrenda() {
        return producto;
    }

    public void setPrenda(Producto prenda) {
        this.producto = prenda;
    }
   
}
