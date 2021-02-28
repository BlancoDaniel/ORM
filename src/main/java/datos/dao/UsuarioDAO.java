package datos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.configuracion.UtilHibernate;
import datos.dao.interfaces.IUsuarioDAO;
import modelo.entidades.Usuario;

public class UsuarioDAO extends GenericDAOImpl<Usuario, Long> implements IUsuarioDAO{

	@Override
	public List<Usuario> ListarUsuarios() {
		 List<Usuario> usuario = new ArrayList<Usuario>();
	        Transaction t = null;
	        Session session = UtilHibernate.getSessionFactory().openSession();
	        try {
	            t = session.beginTransaction();
	            usuario = session.createQuery("from Usuarios").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return usuario;
	    }  }
