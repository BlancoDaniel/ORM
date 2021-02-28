package datos.dao.interfaces;

import java.util.List;

import modelo.entidades.Autor;

public interface IAutorDAO extends GenericDAO<Autor, Long> {
	 public List<Autor> ListarAutores();
	}


