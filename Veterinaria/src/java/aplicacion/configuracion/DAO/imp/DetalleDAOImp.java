/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO.imp;

import aplicacion.configuracion.DAO.IDetalleDAO;
import aplicacion.hibernate.util.HibernateUtil;
import aplicacion.modelo.dominio.Detalle;
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
public class DetalleDAOImp implements IDetalleDAO, Serializable{

    /**
     * método que crea y guarda un detalle en la base de datos.
     * @param detalle a guardar
     */
    @Override
    public void crear(Detalle detalle) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(detalle);
        session.getTransaction().commit();
        session.close();
    }

    /**
     * elimina un detalle guardado en la base de datos.
     * @param detalle a eliminar
     */
    @Override
    public void borrar(Detalle detalle) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(detalle);
        session.getTransaction().commit();
        session.close();
    }

    /**
     * actualiza un detalle existente en la base de datos.
     * @param detalle a modificar
     */
    @Override
    public void modificar(Detalle detalle) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(detalle);
        session.getTransaction().commit();
        session.close();
    }

    /**
     * 
     * @return todos los detalles almacenados en la base de datos.
     */
    @Override
    public List<Detalle> obtenerTodos() {
        ArrayList<Detalle> detalles = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Detalle.class);
        criteria.add(Restrictions.like("estado", true));
        if (!(criteria.list().isEmpty())){
             detalles = (ArrayList<Detalle>)criteria.list();
        session.close();
        }
        return detalles;
    }
    
}
