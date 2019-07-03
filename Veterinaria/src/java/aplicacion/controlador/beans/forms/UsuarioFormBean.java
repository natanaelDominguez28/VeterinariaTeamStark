/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.bean.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
//import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.primefaces.PrimeFaces;
import org.primefaces.context.RequestContext;

/**
 *
 * @author nata
 */
/*@ManagedBean
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

    }*/
/**
 * @PostConstruct public void init(){ obtenerUsuarios(); }*
 */
/*private void obtenerUsuarios() {
        listaDeUsuarios = usuarioBean.obtenerUsuario();
    }

    public void agregarUsuario() {
        usuarioBean.agregarUsuario();
        usuarioBean.getUsuario().setEstado(Boolean.TRUE);
        //usuarioBean.getUsuario().setTipoUsuario("administrador");
        usuarioBean.modificarUsuario();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario agregado correctamente", "Usuario agregado");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

    //agregar metodos abm
    public void modificarUsuario() {
        usuarioBean.modificarUsuario();
        FacesContext facesContex = FacesContext.getCurrentInstance();
        facesContex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario modificado exitosamente", "Usuario modificado exitosamente"));
        obtenerUsuarios();//generar el listado
        RequestContext.getCurrentInstance().execute("PF('ModificarUsuario').hide()");
        RequestContext.getCurrentInstance().update("frmUsuarios:tblUsuarios");
    }

    public void eliminarUsuario(Usuario us) {
        //usuarioBean.setUsuario(usuarioBean.getUsuario());
        usuarioBean.eliminarUsuario(us);
        FacesContext facesContex = FacesContext.getCurrentInstance();
        facesContex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario eliminado exitosamente", "Usuario eliminado exitosamente"));
        obtenerUsuarios();//generar el listado

        //RequestContext.getCurrentInstance().update("frmUsuarios:tblUsuarios");
    }
}*/
@ManagedBean
@ViewScoped    //agrege el alcance

public class UsuarioFormBean implements Serializable {

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private Usuario usuario = new Usuario();
    private List<Usuario> listaDeUsuarios;

    public UsuarioFormBean() {
        //usuarioBean = new UsuarioBean();

    }

    @PostConstruct
    public void init() {
        obtenerUsuario();
        //usuarioBean = new UsuarioBean();
    }

    /**
     * Método que permite exportar el archivo pdf, una lista de usuarios
     *
     * @param actionEvent
     * @throws JRException
     * @throws IOException
     */
    public void exportarUsuariosPdf(ActionEvent actionEvent) throws JRException, IOException {
        Map<String, Object> parametros = new HashMap<String, Object>();

        File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/usuarios.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros,
                new JRBeanCollectionDataSource(obtenerUsuario()));
        /*HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.setContentType("application/pdf");
        response.addHeader("Content-disposition", "attachment; filename=usuarios.pdf");
        ServletOutputStream stream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

        stream.flush();
        stream.close();
        FacesContext.getCurrentInstance().responseComplete();*/
    }

    /**
     * Metodo que permite obtener todas los alumnos que estan cargados en la
     * tabla alumnos
     *
     * @return 
     */
    public List<Usuario> obtenerUsuario() {
        listaDeUsuarios = usuarioBean.obtenerUsuario();
        return listaDeUsuarios;
    }

    /*
    private void obtenerUsuarios() {
        listaDeUsuarios = usuarioBean.obtenerUsuario();
    }*/
    public void modificarUsuario() {
        usuarioBean.modificarUsuario();
        FacesContext facesContex = FacesContext.getCurrentInstance();
        facesContex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario modificado exitosamente", "Usuario modificado exitosamente"));
        obtenerUsuario();//generar el listado
        RequestContext.getCurrentInstance().execute("PF('ModificarUsuario').hide()");
        RequestContext.getCurrentInstance().update("frmUsuarios:tblUsuarios");
    }

    /*permite selecionar de la lista que  usuarios vamos a modificar*/
    public void asignarUsuarioSeleccionado(Usuario usuario) {
        usuarioBean.setUsuario(usuario);
    }

    /*agrega un usuario a la lista de usuarios de tipo Administrador*/
    public void agregarUsuario() {

        /*if (validarUsuario() == true) {
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage("usuario logueado ya"));
            

        } else {
            usuarioBean.agregarUsuario(usuario);
            usuarioBean.getUsuario().setEstado(Boolean.TRUE);
            usuarioBean.getUsuario().setTipoUsuario("Administrativo");
            usuarioBean.modificarUsuario();
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Usuario agregado correctamente", "Usuario agregado");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            
        }*/
       
        usuarioBean.agregarUsuario(usuario);
        usuarioBean.getUsuario().setEstado(Boolean.TRUE);
        usuarioBean.getUsuario().setTipoUsuario("Administrador");
        usuarioBean.modificarUsuario();
        //FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Usuario agregado correctamente", "Usuario agregado");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

    /*agrega un usuario a la lista de usuarios de tipo Consumidor*/
    public void agregarUsuarioConsumidor(Usuario usuario) {

        if (validarUsuario() == true) {
            usuarioBean.agregarUsuario(usuario);
            usuarioBean.getUsuario().setEstado(Boolean.TRUE);
            usuarioBean.getUsuario().setTipoUsuario("Consumidor");
            usuarioBean.modificarUsuario();
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Usuario agregado correctamente", "Usuario agregado");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);

        } else {
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage("usuario logueado ya"));
        }
    }

    /*metodo que compara el nombreUsuario de los usuarios de la lista con los que va a ingresar*/
    public boolean validarUsuario() {
        return usuarioBean.obtenerUsuario().get(0).getNombreUsuario().equals(usuarioBean.getUsuario().getNombreUsuario());

    }

    public void eliminarUsuario(Usuario usuario) {
        usuarioBean.setUsuario(usuario);
        usuarioBean.eliminarUsuario(usuarioBean.getUsuario());
        FacesContext facesContex = FacesContext.getCurrentInstance();
        facesContex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Usuario eliminado exitosamente", "Usuario eliminado exitosamente"));
        obtenerUsuario();//generar el listado
        //RequestContext.getCurrentInstance().update("frmUsuarios:tblUsuarios"); Método deprecado
        PrimeFaces.current().ajax().update("frmUsuarios:tblUsuarios");
    }

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
