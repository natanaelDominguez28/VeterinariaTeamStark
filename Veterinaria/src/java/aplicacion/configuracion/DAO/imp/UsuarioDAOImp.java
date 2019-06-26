/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.configuracion.DAO.imp;

import aplicacion.modelo.dominio.Usuario;
import aplicacion.configuracion.DAO.IUsuarioDAO;
import aplicacion.hibernate.configuracion.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mabel
 */
public class UsuarioDAOImp implements IUsuarioDAO, Serializable {
    

    @Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.like("password", password));
        //criteria.add(Restrictions.like("estado", true ));
        if (!criteria.list().isEmpty()) {
            usuario = (Usuario) criteria.list().get(0);
        }
        session.close();
        return usuario;

    }

    @Override
    public void agregar(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        session.close();
    }
//agrege los metodos abstractos eliminar y modificar
    @Override
    public void eliminar(Usuario usuario) {
      Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(usuario);
        session.getTransaction().commit();
        session.close();  
    }

    @Override
    public void modificar(Usuario usuario) {
      Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();
        session.close();  
    }

    @Override
    public List<Usuario> obtenerUsuario() {
               Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria=session.createCriteria(Usuario.class);
        criteria.addOrder(Order.asc("apellido"));
        List lista=criteria.list();
        session.getTransaction();
        session.close();
        return  lista;
    }

    @Override
    public Usuario obtenerUsuario(String correoElectronico) {
        Session session =HibernateUtil.getSessionFactory().openSession();
       Criteria criteria = session.createCriteria(Usuario.class);
       criteria.add(Restrictions.like("correoElectronico",correoElectronico));
       Usuario usuario = null;
       if (!criteria.list().isEmpty()){
         usuario =(Usuario)criteria.list().get(0); // preguntar lo que esta dentro del parentesis
         
       }
      // session.getTransaction().commit();
       session.close();
       return usuario;
    }

}
