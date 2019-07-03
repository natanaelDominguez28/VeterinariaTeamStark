/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO;

import aplicacion.modelo.dominio.Factura;
import java.util.List;

/**
 *
 * @author nata
 */
public interface IFacturaDAO {
    void crear(Factura factura);
    void borrar(Factura factura);
    void modificar(Factura factura);
    List<Factura> obtenerTodos();
}
