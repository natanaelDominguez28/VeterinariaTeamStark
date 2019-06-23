/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.bean.DetalleBean;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author nata
 */
@ManagedBean
@ViewScoped
public class DetalleFormBean implements Serializable{
    @ManagedProperty(value = "#{detalleBean}")
    private DetalleBean detalleBean;

    /**
     * Creates a new instance of DetalleFormBean
     */
    public DetalleFormBean() {
        detalleBean = new DetalleBean();
    }
    
    public void agregarDetalle(){
        
    }

    public DetalleBean getDetalleBean() {
        return detalleBean;
    }

    public void setDetalleBean(DetalleBean detalleBean) {
        this.detalleBean = detalleBean;
    }
    
    
    
}
