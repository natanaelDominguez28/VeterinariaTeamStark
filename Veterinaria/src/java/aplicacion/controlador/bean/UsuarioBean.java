/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.bean;


import aplicacion.configuracion.DAO.IUsuarioDAO;
import aplicacion.configuracion.DAO.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author SONY
 */
@ManagedBean
@ViewScoped
public class UsuarioBean {
    private Usuario usuario;
    private IUsuarioDAO usuarioDAO;
 /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    usuario=new Usuario();
    usuarioDAO=new UsuarioDAOImp();
    }
    
    public void agregarUsuario(){
        usuarioDAO.agregar(usuario);
    }
    
    
    /**
     * Metodo que devuelve el usuario encontrado en la base de datos
     * @param nombreUsuario
     * @param password
     * @return  null si no lo encuentra*/
    public Usuario validarUsuario(String nombreUsuario, String password){
        return usuarioDAO.validarUsuario(nombreUsuario, password);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public IUsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(IUsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }


   
    
}
