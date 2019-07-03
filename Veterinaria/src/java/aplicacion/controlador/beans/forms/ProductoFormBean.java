/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.configuracion.DAO.IProductoDAO;
import aplicacion.configuracion.DAO.imp.ProductoDAOImp;
import aplicacion.controlador.bean.ProductoBean;
import aplicacion.modelo.dominio.Producto;
import aplicaion.modelo.util.CompraProducto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author pc carolina
 *
 * @ManagedProperty(value = "#{productoBean}") private ProductoBean
 * productoBean;
 *
 * private DetalleFormBean detalle; public ProductoFormBean() { productoBean =
 * new ProductoBean(); }
 *
 * public void agregarProducto() { productoBean.agregarProducto(); }
 *
 * public ProductoBean getProductoBean() { return productoBean; }
 *
 * public void setProductoBean(ProductoBean productoBean) { this.productoBean =
 * productoBean; }
 *
 * esta clase cumple especificamente con la funcion de ver la tabla de productos
 * para el usuario tipo consumidor
 */
@ManagedBean
@ViewScoped
public class ProductoFormBean implements Serializable {

    @ManagedProperty(value = "#{productoBean}") //inyeccion con la clase productoBean
    private ProductoBean productoBean; // el objeto ProductoBean
    private DetalleFormBean detalleFormBean = new DetalleFormBean();
    //private List<Producto> listaProductos = new ArrayList<>();
    private List<Producto> listaProductos; // mi lista de productos
    private Producto producto = new Producto();; //objeto producto
    private int cantidad; // inicilizacion de variables 
    private double total = 0.0;
    private CompraProducto compraProducto; // inicializacion de una nueva compa
    private List<CompraProducto> listaProductoParcial;// lista de los productos comprados 

    // constructor 
    public ProductoFormBean() {
        // comento esta línea porque no hace falta inicializa productoBean al ser un bean administrado -> productoBean = new ProductoBean();
      listaProductoParcial = new ArrayList<>();
      listaProductos = new ArrayList<>();
      compraProducto = new CompraProducto();
    }

    @PostConstruct //cual es el metodo que se va a ejecutar desp de construir el objeto
    public void init() {
        obtenerProducto();
    }

    //método que se ejecutará al editar un producto registrado en la base de datos.
    public void onRowEdit(RowEditEvent event) {
        Producto productoModificado = (Producto) event.getObject();
        productoBean.modificarProducto(productoModificado);
        FacesMessage message = new FacesMessage("Éxito", "Producto modificado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void onRowEditCancel(RowEditEvent event) {
        FacesMessage message = new FacesMessage("Sin cambios", "Modificación cancelada");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    //método con el que guardo un producto a registrar en la base de datos
    public void agregarProducto(){
        //producto = new Producto();
        productoBean.agregarProducto(producto);
        FacesMessage message = new FacesMessage("Éxito", "Producto agregado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, message);
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
    
    public List<CompraProducto> getListaProductoParcial() {
        return listaProductoParcial;
    }

    public void setListaProductoParcial(List<CompraProducto> listaProductos) {
        this.listaProductoParcial = listaProductos;
    }

    /*Iterable<CompraProducto> getListaProductoParcial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /*metodo para asiganarProducto a mi carrito de los productos que voy comprando
    donde traigo todos los datos correspondiente de la compra Poducto
    la descripcion, el precio Costo, el codigo, etc
     */
    public void asignarProducto(Producto productoSeleccionado) {
        //producto = productoSeleccionado;
        compraProducto = new CompraProducto();
        compraProducto.setDescripcion(productoSeleccionado.getDescripcion());
        compraProducto.setPrecioCosto(productoSeleccionado.getPrecioCosto());
        //compraProducto.setCodigo(productoSeleccionado.getCodigo());
        compraProducto.setNombre(productoSeleccionado.getNombre());
        compraProducto.setPrecioLista(productoSeleccionado.getPrecioLista());
        compraProducto.setStock(productoSeleccionado.getStock());
        System.out.println("compraProducto.getPrecioCosto" + compraProducto.getPrecioCosto());
        System.out.println("productoSeleccionado.getDescripcion" + productoSeleccionado.getDescripcion());

    }
    // obtener producto

    public void obtenerProducto() {
        listaProductos = productoBean.obtenerListadoProducto();
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("listaProductos", listaProductos);
    }

    public void eliminarProducto(Producto prod) {
        productoBean.eliminarProducto(prod);
        FacesMessage message = new FacesMessage("Éxito", "Producto eliminado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, message);
        obtenerProducto();
    }

    // agregdo
    public void agregarLista() { // solo va a visualizar en la vista los productos que vamos poniendo en el carrito.
        /*if (listaProductoParcial == null) {
            System.out.println("Entri or aqui");
            listaProductoParcial = new ArrayList<>();
            listaProductoParcial.add(compraProducto);
            compraProducto.setSubTotal(compraProducto.getCantidad() * compraProducto.getPrecioCosto());
            compraProducto.setTotal(compraProducto.getTotal() + compraProducto.getSubTotal());

        } else {*/
        CompraProducto aux = new CompraProducto();
        aux = compraProducto;
        //compraProducto.setPrecioCosto(100.0);
            System.out.println("Solo agrega");
            System.out.println(aux.getCantidad());
            System.out.println(aux.getPrecioCosto());
            //listaProductoParcial.add(compraProducto);
            
            //compraProducto = new CompraProducto();
        //}

        compraProducto.setSubTotal(compraProducto.getCantidad() * compraProducto.getPrecioCosto());

        compraProducto.setTotal(compraProducto.getTotal() + compraProducto.getSubTotal());
listaProductoParcial.add(aux);
        System.out.println("total" + aux.getTotal());
        //compraProducto.getTotal();
        //compraProducto = new CompraProducto();

    }

}
