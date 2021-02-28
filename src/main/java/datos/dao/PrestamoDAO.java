package datos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.configuracion.UtilHibernate;
import datos.dao.interfaces.IPrestamoDAO;
import modelo.entidades.Prestamo;

public class PrestamoDAO extends GenericDAOImpl<Prestamo, Long> implements IPrestamoDAO{

	@Override
	public List<Prestamo> ListarPrestamos() {
		 List<Prestamo> prestamo = new ArrayList<Prestamo>();
	        Transaction t = null;
	        Session session = UtilHibernate.getSessionFactory().openSession();
	        try {
	            t = session.beginTransaction();
	            prestamo = session.createQuery("from Prestamo").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return prestamo;
	    }  }