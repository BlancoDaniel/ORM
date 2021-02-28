package datos.dao.interfaces;

import java.util.List;
import modelo.entidades.Libro;

public interface ILibroDAO extends GenericDAO<Libro, Long> {
	 public List<Libro> ListarLibros();
}

