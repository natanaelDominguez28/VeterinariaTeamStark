/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO.imp;

import aplicacion.configuracion.DAO.IProductoDAO;
import aplicacion.hibernate.util.HibernateUtil;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nata
 */
public class ProductoDAOImp implements IProductoDAO, Serializable{

    @Override
    public void crear(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(producto);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void borrar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
