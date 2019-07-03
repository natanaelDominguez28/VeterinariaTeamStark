/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO.imp;

import aplicacion.configuracion.DAO.IFacturaDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Factura;
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
public class FacturaDAOImp implements IFacturaDAO, Serializable{

    @Override
    public void crear(Factura factura) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(factura);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void borrar(Factura factura) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(factura);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar(Factura factura) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(factura);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Factura> obtenerTodos() {
        ArrayList<Factura> facturas = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Factura.class);
        criteria.add(Restrictions.like("estado", true));
        if (!(criteria.list().isEmpty())){
             facturas = (ArrayList<Factura>)criteria.list();
        session.close();
        }
        return facturas;
    }
    
}
