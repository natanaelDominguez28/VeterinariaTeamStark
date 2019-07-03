/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.bean;

import aplicacion.configuracion.DAO.IProductoDAO;
import aplicacion.configuracion.DAO.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author nata
 */
@ManagedBean
@ViewScoped
public class ProductoBean implements Serializable{
    private Producto producto;
    private IProductoDAO productoDAO;

    /**
     * Creates a new instance of ProductoBean
     */
    public ProductoBean() {
        producto = new Producto();
        productoDAO = new ProductoDAOImp();
    }
    
    public void agregarProducto(Producto producto){
        productoDAO.crear(producto);
    }

    public void modificarProducto(Producto producto){
        productoDAO.modificar(producto);
    }
    
    public void eliminarProducto(Producto producto){
        productoDAO.borrar(producto);
    }
    
    public List<Producto> obtenerListadoProducto(){
        return productoDAO.obtenerTodos();
    }

    public IProductoDAO getProductoDAO() {
        return productoDAO;
    }

    public void setProductoDAO(IProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
}
