/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.configuracion.DAO.imp.ProductoDAOImp;
import aplicacion.controlador.bean.ProductoBean;
import aplicacion.modelo.dominio.Producto;
import aplicaion.modelo.util.CompraProducto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

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
    
 * esta clase cumple especificamente con la funcion de ver la tabla de productos 
 * para el usuario tipo consumidor 
 */
@ManagedBean
@ViewScoped
public class ProductoFormBean implements Serializable{
    @ManagedProperty (value="#{productoBean}") //inyeccion con la clase productoBean
    private ProductoBean productoBean; // el objeto ProductoBean
   private DetalleFormBean detalleFormBean = new DetalleFormBean();
   //private List<Producto> listaProductos = new ArrayList<>();
   private List<Producto> listaProductos ; // mi lista de productos
   private Producto producto = new Producto(); //objeto producto
   private int cantidad; // inicilizacion de variables 
   private double total=0.0;
   private CompraProducto compraProducto = new CompraProducto(); // inicializacion de una nueva compa
     private List<CompraProducto> listaProductoParcial;// lista de los productos comprados 
   
      
   // constructor 
    
    public ProductoFormBean(){
     productoBean = new ProductoBean();
    
    }
    
    
     @PostConstruct //cual es el metodo que se va a ejecutar desp de construir el objeto
    public void init() {
        obtenerProducto();
    }

    
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

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    Iterable<CompraProducto> getListaProductoParcial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    /*metodo para asiganarProducto a mi carrito de los productos que voy comprando
    donde traigo todos los datos correspondiente de la compra Poducto
    la descripcion, el precio Costo, el codigo, etc
   */
      public void asignarProducto(Producto productoSeleccionado){
        producto = productoSeleccionado;
        compraProducto.setDescripcion(producto.getDescripcion());
        compraProducto.setPrecioCosto(producto.getPrecioCosto());
       // compraProducto.setCodigo(producto.getCodigo());
        compraProducto.setNombre(producto.getNombre());
        compraProducto.setPrecioLista(producto.getPrecioLista());
        compraProducto.setStock(producto.getStock());
       
     
    }
      // obtener producto
      
      public void obtenerProducto() {
        listaProductos = productoBean.obtenerListadoProducto();
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("listaProductos", listaProductos);
    }
      
      
      
      
      
      
      
      
      
      
    
    
    // agregdo
     public void agregarLista(){ // solo va a visualizar en la vista los productos que vamos poniendo en el carrito.
       if(listaProductoParcial == null){
        listaProductoParcial = new ArrayList<>();
        listaProductoParcial.add(compraProducto);
         compraProducto.setSubTotal(compraProducto.getCantidad()* compraProducto.getPrecioCosto());
         compraProducto.setTotal(compraProducto.getTotal()+ compraProducto.getSubTotal());
          
         
      } else
   
    listaProductoParcial.add(compraProducto);
   
       compraProducto.setSubTotal(compraProducto.getCantidad()* compraProducto.getPrecioCosto());
     
      
       compraProducto.setTotal(compraProducto.getTotal()+ compraProducto.getSubTotal());
         
       
        System.out.println("total"+compraProducto.getTotal());
       compraProducto = new CompraProducto();
       
   } 
  
    

    
   
}
