/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion.hibernate.configuracion.DaoImp;

import aplicacion.dominio.Usuario;
import aplicacion.hibernate.configuracion.DAO.IUsuarioDAO;
import java.io.Serializable;



/**
 * 
 * @author mabel
 */
public class UsuarioDAOImp implements IUsuarioDAO, Serializable{

    @Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
     /**   Usuario usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.like("password", password));
        criteria.add(Restrictions.like("estado", true));
        if(!criteria.list().isEmpty())
            usuario = (Usuario)criteria.list().get(0);
        session.close();
        return usuario;
        * **/
     return null;
    }



}
