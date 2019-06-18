/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO;

import aplicacion.modelo.dominio.Detalle;
import java.util.List;

/**
 *
 * @author nata
 */
public interface IDetalleDAO {
    public void crear(Detalle detalle);
    public void borrar(Detalle detalle);
    public void modificar(Detalle detalle);
    public List<Detalle> obtenerTodos();
}
