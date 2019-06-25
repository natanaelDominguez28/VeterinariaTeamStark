/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.bean.UsuarioBean;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author nata
 */
@ManagedBean
@ViewScoped    //agrege el alcance
public class UsuarioFormBean implements Serializable {

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;//get y set de usuarioBean

    public UsuarioFormBean() {
    }

    public void agregarUsuario() {
        usuarioBean.agregarUsuario();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario agregado correctamente", "Usuario agregado");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    //agregar metodos abm
    public void modificarUsuario() {
        usuarioBean.modificarUsuario();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario modificado correctamente", "Usuario modificado");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

    public void eliminarUsuario() {
        usuarioBean.eliminarUsuario();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario eliminado correctamente ", "Usuario eliminado");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }
}
