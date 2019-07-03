package aplicacion.modelo.dominio;
// Generated 03/07/2019 16:32:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private long codigo;
     private String nombre;
     private String descripcion;
     private Double precioLista;
     private Double precioCosto;
     private Integer stock;
     private Boolean estado;
     private Set detalles = new HashSet(0);

    public Producto() {
    }

	
    public Producto(long codigo) {
        this.codigo = codigo;
    }
    public Producto(long codigo, String nombre, String descripcion, Double precioLista, Double precioCosto, Integer stock, Boolean estado, Set detalles) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.precioLista = precioLista;
       this.precioCosto = precioCosto;
       this.stock = stock;
       this.estado = estado;
       this.detalles = detalles;
    }
   
    public long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getPrecioLista() {
        return this.precioLista;
    }
    
    public void setPrecioLista(Double precioLista) {
        this.precioLista = precioLista;
    }
    public Double getPrecioCosto() {
        return this.precioCosto;
    }
    
    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Set getDetalles() {
        return this.detalles;
    }
    
    public void setDetalles(Set detalles) {
        this.detalles = detalles;
    }




}


