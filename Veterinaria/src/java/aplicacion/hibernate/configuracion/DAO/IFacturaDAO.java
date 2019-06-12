/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.configuracion.DAO;

/**
 *
 * @author nata
 */
public interface IFacturaDAO {
    void crear();
    void borrar();
    void modificar();
    void obtenerTodos();
}
