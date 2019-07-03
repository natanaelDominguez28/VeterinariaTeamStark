/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.bean;


import aplicacion.configuracion.DAO.IUsuarioDAO;
import aplicacion.configuracion.DAO.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author SONY
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable{
    private Usuario usuario;
    private IUsuarioDAO usuarioDAO;
 /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    usuario=new Usuario();
    
    }
    
    public void agregarUsuario(Usuario us){
        usuarioDAO=new UsuarioDAOImp();
        usuarioDAO.agregar(us);
    }
   
    //llamados de los metoodos de la implementacion
     public void modificarUsuario(){
     usuarioDAO = new UsuarioDAOImp();
     usuarioDAO.modificar(usuario);
    }
    public void eliminarUsuario(Usuario us){
        usuarioDAO = new UsuarioDAOImp();
        usuarioDAO.eliminar(us);
    }
    
    
    /**
     * Metodo que devuelve el usuario encontrado en la base de datos
     * @param nombreUsuario
     * @param password
     * @return  null si no lo encuentra*/
    public Usuario validarUsuario(String nombreUsuario, String password){
        usuarioDAO=new UsuarioDAOImp();
        return usuarioDAO.validarUsuario(nombreUsuario, password);
    }
    
   public List<Usuario> obtenerUsuario(){
    IUsuarioDAO iUsuarioDAO=new UsuarioDAOImp();
    return iUsuarioDAO.obtenerUsuario();
    
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
