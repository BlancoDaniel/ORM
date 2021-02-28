package datos.dao.interfaces;

import java.util.List;

import modelo.entidades.Ejemplar;

public interface IEjemplarDAO extends GenericDAO<Ejemplar, Long> {
	 public List<Ejemplar> ListarEjemplares();

}
