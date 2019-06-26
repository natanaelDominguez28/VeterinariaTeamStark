/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO;

import aplicacion.modelo.dominio.Usuario;
import java.util.List;



/**
 *
 * @author mabel
 */
public interface IUsuarioDAO {
    /**
     * método a implementar 
     * @param nombreUsuario
     * @param password
     * @return el usuario validado segun su nombre de usuario y password
     */
    public Usuario validarUsuario(String nombreUsuario, String password);
    public void agregar(Usuario usuario);
  //interfaz de usuario
      public void eliminar(Usuario usuario);
      public void modificar(Usuario usuario);  
     public List<Usuario> obtenerUsuario();
     Usuario obtenerUsuario(String correoElectronico);
}
