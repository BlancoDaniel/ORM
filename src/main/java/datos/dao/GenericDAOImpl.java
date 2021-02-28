package datos.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;

import org.hibernate.HibernateException;
import datos.dao.interfaces.GenericDAO;

public class GenericDAOImpl<Entity, K extends Serializable> implements GenericDAO<Entity, K> {

	public Class<Entity> domainClass = getDomainClass();
	private Session session;

	protected Class getDomainClass() {
		if (domainClass == null) {
			ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
			domainClass = (Class) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	private Session getHibernateTemplate() {
		session = datos.configuracion.UtilHibernate.getSessionFactory().openSession();
		session.beginTransaction();
		return session;
	}

	@Override
	public void Modificar(Entity t) {
		try {
			getHibernateTemplate().update(t);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Entity ObtenerPorId(K id) {
		Entity returnValue = (Entity) getHibernateTemplate().load(domainClass, id);
		session.getTransaction().commit();
		return returnValue;
	}

	@Override
	public void Eliminar(Entity t) {
		getHibernateTemplate().delete(t);
		session.getTransaction().commit();
	}

	@Override
	public void Insertar(Entity t) {

		try {
			getHibernateTemplate().save(t);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
