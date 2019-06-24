/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.bean.ProductoBean;
import aplicacion.modelo.dominio.Producto;
import aplicaion.modelo.util.CompraProducto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.faces.bean.ViewScoped;

/**
 *
 * @author nata
 * 
 * @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;

    private DetalleFormBean detalle;
    public ProductoFormBean() {
        productoBean = new ProductoBean();
    }
    
    public void agregarProducto() {
        productoBean.agregarProducto();
    }

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }
    
 * 
 */
@ManagedBean
@ViewScoped
public class ProductoFormBean implements Serializable{
   private DetalleFormBean detalleFormBean;
   private List<Producto> listaProductos = new ArrayList<>();
   private Producto producto = new Producto();
   private List<CompraProducto> lstaProductoParcial;
   private int cantidad;
   private double total=0.0;
   private CompraProducto compraProducto = new CompraProducto();

    
   // getters and setters
   public DetalleFormBean getDetalleFormBean() {
        return detalleFormBean;
    }

    public void setDetalleFormBean(DetalleFormBean detalleFormBean) {
        this.detalleFormBean = detalleFormBean;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<CompraProducto> getLstaProductoParcial() {
        return lstaProductoParcial;
    }

    public void setLstaProductoParcial(List<CompraProducto> lstaProductoParcial) {
        this.lstaProductoParcial = lstaProductoParcial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public CompraProducto getCompraProducto() {
        return compraProducto;
    }

    public void setCompraProducto(CompraProducto compraProducto) {
        this.compraProducto = compraProducto;
    }
    
   
   // constructor 
    
    public ProductoFormBean(){
    
   
        
        
        
        
    }
   
}
