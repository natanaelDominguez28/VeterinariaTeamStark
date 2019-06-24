/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaion.modelo.util;

import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;

/**
 *
 * @author pcarolina
 */
public class CompraProducto implements Serializable{
    
    private String codigo ="123";
    private String nombre="pipeta";
    private String descripcion;
    private Double subTotal;
    private Double precioCosto;
    private Producto prenda;

    
    public CompraProducto() {
    }
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private Integer cantidad;
    private Double precioLista;

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
  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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
        return prenda;
    }

    public void setPrenda(Producto prenda) {
        this.prenda = prenda;
    }
   

    
    
    
    
    
    
    
    
    
}
