package datos.dao.interfaces;

import java.util.List;

import modelo.entidades.Usuario;

public interface IUsuarioDAO  extends GenericDAO<Usuario, Long> {
	 public List<Usuario> ListarUsuarios();

}
