/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO.imp;

import aplicacion.configuracion.DAO.IProductoDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author natanael_dominguez
 */
public class ProductoDAOImp implements IProductoDAO, Serializable{

    /**
     * método que crea un producto y lo guarda en la base de datos.
     * @param producto a guardar
     */
    @Override
    public void crear(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(producto);
        session.getTransaction().commit();
        session.close();
    }

    /**
     * método que elimina un producto de la base de datos.
     * @param producto a eliminar
     */
    @Override
    public void borrar(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(producto);
        session.getTransaction().commit();
        session.close();
    }

    /**
     * método que modifica un producto y lo actualiza en la base de datos.
     * @param producto a modificar
     */
    @Override
    public void modificar(Producto producto) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(producto);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * método que obtiene todos los productos.
     * @return la lista de todos los productos que existen en la base de datos.
     */
    @Override
    public List<Producto> obtenerTodos() {
        ArrayList<Producto> productos = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Producto.class);
        criteria.add(Restrictions.like("estado", true));
        if (!(criteria.list().isEmpty())){
             productos = (ArrayList<Producto>)criteria.list();
        session.close();
        }
        return productos;
    }


    
}
