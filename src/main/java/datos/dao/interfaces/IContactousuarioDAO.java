package datos.dao.interfaces;

import java.util.List;

import modelo.entidades.Contactousuario;

public interface IContactousuarioDAO extends GenericDAO<Contactousuario, Long> {
	 public List<Contactousuario> ListarContactousuario();
	}
