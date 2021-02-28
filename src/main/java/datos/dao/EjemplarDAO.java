package datos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.configuracion.UtilHibernate;
import datos.dao.interfaces.IEjemplarDAO;
import modelo.entidades.Ejemplar;

public class EjemplarDAO extends GenericDAOImpl<Ejemplar, Long> implements IEjemplarDAO{

	@Override
	public List<Ejemplar> ListarEjemplares() {
		 List<Ejemplar> ejemplar = new ArrayList<Ejemplar>();
	        Transaction t = null;
	        Session session = UtilHibernate.getSessionFactory().openSession();
	        try {
	            t = session.beginTransaction();
	            ejemplar = session.createQuery("from Ejemplar").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return ejemplar;
	    }

}
