package datos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.configuracion.UtilHibernate;
import datos.dao.interfaces.IAutorDAO;
import modelo.entidades.Autor;

public class AutorDAO extends GenericDAOImpl<Autor, Long> implements IAutorDAO{

	@Override
	public List<Autor> ListarAutores() {
		 List<Autor> autor = new ArrayList<Autor>();
	        Transaction t = null;
	        Session session = UtilHibernate.getSessionFactory().openSession();
	        try {
	            t = session.beginTransaction();
	            autor = session.createQuery("from Autos").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return autor;
	    }  

}
