package datos.configuracion;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilHibernate {
	public static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex) {
			System.err.println("Error al establecer la configuración de hibernate." + ex);
			throw new ExceptionInInitializerError();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
