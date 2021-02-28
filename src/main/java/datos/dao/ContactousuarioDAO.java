package datos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.configuracion.UtilHibernate;
import datos.dao.interfaces.IContactousuarioDAO;
import modelo.entidades.Contactousuario;

public class ContactousuarioDAO extends GenericDAOImpl<Contactousuario, Long> implements IContactousuarioDAO {

	 public List<Contactousuario> ListarContactousuario() {
	        List<Contactousuario> contactousuario = new ArrayList<Contactousuario>();
	        Transaction t = null;
	        Session session = UtilHibernate.getSessionFactory().openSession();
	        try {
	            t = session.beginTransaction();
	            contactousuario = session.createQuery("from Contactousuario").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return contactousuario;
	    }  
}
