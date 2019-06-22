/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO;

import aplicacion.modelo.dominio.Usuario;



/**
 *
 * @author mabel
 */
public interface IUsuarioDAO {
    
    public Usuario validarUsuario(String nombreUsuario, String password);
    public void agregar(Usuario usuario);
}
