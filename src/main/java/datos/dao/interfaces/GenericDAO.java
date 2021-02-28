package datos.dao.interfaces;

import java.io.Serializable;

public interface GenericDAO<Entity, PK extends Serializable> {
	
	void Insertar(Entity t);

	void Modificar(Entity t);

	Entity ObtenerPorId(PK id);

	void Eliminar(Entity t);
}
