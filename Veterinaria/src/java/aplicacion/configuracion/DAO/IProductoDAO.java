/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO;

import aplicacion.modelo.dominio.Producto;
import java.util.List;

/**
 *
 * @author nata
 */
public interface IProductoDAO {
    public void crear(Producto producto);
    public void borrar(Producto producto);
    public void modificar(Producto producto);
    public List<Producto> obtenerTodos();
    
}
