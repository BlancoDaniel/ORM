package datos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.configuracion.UtilHibernate;
import datos.dao.interfaces.ILibroDAO;
import modelo.entidades.Libro;

public class LibroDAO extends GenericDAOImpl<Libro, Long> implements ILibroDAO{

	@Override
	public List<Libro> ListarLibros() {
		 List<Libro> libro = new ArrayList<Libro>();
	        Transaction t = null;
	        Session session = UtilHibernate.getSessionFactory().openSession();
	        try {
	            t = session.beginTransaction();
	            libro = session.createQuery("from Autor").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return libro;
	    }  }
