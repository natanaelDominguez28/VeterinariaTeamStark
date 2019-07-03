/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Detalle;
import aplicacion.modelo.dominio.Factura;
import aplicacion.modelo.dominio.Usuario;
import aplicaion.modelo.util.CompraProducto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author pc
 * carolina
 */
@ManagedBean
@RequestScoped
public class PedidoFormBean implements Serializable{
   @ManagedProperty(value = "#{productoFormBean}") // aqui necesitamos la listaProductoParcial para acceder a ella y guardar en el pedido
      private ProductoFormBean productoFormBean;
      private List<Detalle>listaDetallePedidos; // lista de toda la factuta con detalle
      private Factura factura;

      
      
      //Constructores
    public PedidoFormBean() {
        listaDetallePedidos = new ArrayList<>();
        factura = new Factura();
        //productoFormBean = new ProductoFormBean();
       
                
    }  
      
      
      //geters and setters
      
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List<Detalle> getListaDetallePedidos() {
        return listaDetallePedidos;
    }

    public void setListaDetallePedidos(List<Detalle> listaDetallePedidos) {
        this.listaDetallePedidos = listaDetallePedidos;
    }

    

    public ProductoFormBean getProductoFormBean() {
        return productoFormBean;
    }

    public void setProductoFormBean(ProductoFormBean productoFormBean) {
        this.productoFormBean = productoFormBean;
    }
     
     
     
    
    
    
    public void agregarDetalle(){
    
        factura.setEstado(true);
        factura.setFecha(new Date());
        factura.setUsuario(new Usuario(12,"carina","cari","comprador", Boolean.TRUE));
        for(CompraProducto elementoComprado : productoFormBean.getListaProductoParcial()) {
           Detalle detalle = new Detalle();
            detalle.setCantidad(elementoComprado.getCantidad());
            detalle.setCodigo(elementoComprado.getCodigo());
            //detalle.setProducto(elementoComprado.getProducto().getDescripcion());
            detalle.setProducto(elementoComprado.getProducto());
            detalle.setPrecio(elementoComprado.getPrecioCosto());
            detalle.setPrecioTotal(elementoComprado.getSubTotal());
            detalle.setFactura(factura);
            listaDetallePedidos.add(detalle);
            System.out.println("detalle"+listaDetallePedidos.size());
        }
    
    
    
    }
    
    
    
    
}
