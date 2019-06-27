/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.bean.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
//import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author nata
 */
@ManagedBean
@ViewScoped    //agrege el alcance
//@RequestScoped
public class UsuarioFormBean implements Serializable {
@ManagedProperty(value = "#{usuarioBean}")
private UsuarioBean usuarioBean;
private List<Usuario> listaDeUsuarios;

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }
     
     
    public UsuarioFormBean() {
        usuarioBean=new UsuarioBean();
        
    }
    
    /** @PostConstruct 
    public void init(){
     obtenerUsuarios();
    }**/
     private void obtenerUsuarios() {
        listaDeUsuarios=usuarioBean.obtenerUsuario();
    }

    public void agregarUsuario() {
        usuarioBean.agregarUsuario();
        usuarioBean.getUsuario().setEstado(Boolean.TRUE);
        usuarioBean.getUsuario().setTipoUsuario("administrador");
        usuarioBean.modificarUsuario();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario agregado correctamente", "Usuario agregado");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

   

    //agregar metodos abm
    public void modificarUsuario() {
    usuarioBean.modificarUsuario();
         FacesContext facesContex= FacesContext.getCurrentInstance();
        facesContex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario modificado exitosamente","Usuario modificado exitosamente"));
        obtenerUsuarios();//generar el listado
        RequestContext.getCurrentInstance().execute("PF('ModificarUsuario').hide()");
        RequestContext.getCurrentInstance().update("frmUsuarios:tblUsuarios");
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarioBean.setUsuario(usuario);
         usuarioBean.eliminarUsuario();
         FacesContext facesContex= FacesContext.getCurrentInstance();
        facesContex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario eliminado exitosamente","Usuario eliminado exitosamente"));
        obtenerUsuarios();//generar el listado
        
       RequestContext.getCurrentInstance().update("frmUsuarios:tblUsuarios");
    }
}
