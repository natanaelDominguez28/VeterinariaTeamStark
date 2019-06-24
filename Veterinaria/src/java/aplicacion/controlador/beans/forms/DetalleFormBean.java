/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.bean.DetalleBean;
import aplicacion.modelo.dominio.Detalle;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author carolina
 */

 //@ManagedProperty(value = "#{detalleBean}")
    //private DetalleBean detalleBean;

   // public DetalleFormBean() {
     //   detalleBean = new DetalleBean();
    //}
    
    //public void agregarDetalle(){
        
    //}
    //public DetalleBean getDetalleBean() {
      //  return detalleBean;
    //}

    //public void setDetalleBean(DetalleBean detalleBean) {
      //  this.detalleBean = detalleBean;
    //}

@ManagedBean
@ViewScoped
public class DetalleFormBean implements Serializable{
    private Detalle detalle;
    private Producto producto;
    private int cantidad;
    private double precio;
    private boolean estado;
    
    
    public DetalleFormBean(){
        detalle = new Detalle();
        
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
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
