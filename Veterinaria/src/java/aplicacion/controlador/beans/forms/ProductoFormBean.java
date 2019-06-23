/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.bean.ProductoBean;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author nata
 */
@ManagedBean
@RequestScoped
public class ProductoFormBean implements Serializable{
    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;

    /**
     * Creates a new instance of ProductoFormBean
     */
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
    
    
}
