package datos.dao.interfaces;

import java.util.List;

import modelo.entidades.Prestamo;

public interface IPrestamoDAO extends GenericDAO<Prestamo, Long> {
	 public List<Prestamo> ListarPrestamos();

}
