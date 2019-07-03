/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.configuracion.DAO.IFacturaDAO;
import aplicacion.configuracion.DAO.imp.FacturaDAOImp;
import aplicacion.modelo.dominio.Factura;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author nata
 */
@ManagedBean
@ViewScoped
public class FacturaFormBean implements Serializable{
    private Factura factura; 
    private IFacturaDAO facturaDAO;

    /**
     * Creates a new instance of FacturaFormBean
     */
    public FacturaFormBean() {
        facturaDAO = new FacturaDAOImp();
        factura = new Factura();
    }

    public void crearFactura(){
        facturaDAO.crear(factura);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Factura creada", "factura creada exitosamente"));
    }
    
    public void eliminarFactura(){
        facturaDAO.borrar(factura);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Factura eliminada", "factura eliminada exitosamente"));
    }
    
    public void actualizarFactura(){
        facturaDAO.modificar(factura);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Factura modificada", "factura modificada exitosamente"));
    }
    
    public void obtenerListadoDeFacturas(){
        facturaDAO.obtenerTodos();
    }
    
    
    //Getters and Setters
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public IFacturaDAO getFacturaDAO() {
        return facturaDAO;
    }

    public void setFacturaDAO(IFacturaDAO facturaDAO) {
        this.facturaDAO = facturaDAO;
    }
    
    
    
    
    
}
