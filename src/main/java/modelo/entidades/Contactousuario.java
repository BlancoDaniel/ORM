package modelo.entidades;
// Generated 24 feb. 2021 15:33:51 by Hibernate Tools 5.2.12.Final

/**
 * Contactousuario generated by hbm2java
 */
public class Contactousuario implements java.io.Serializable {

	private int usuarioIdUsuario;
	private Usuario usuario;
	private String email;
	private String telefonoMovil;
	private String telefonoFijo;

	public Contactousuario() {
	}

	public Contactousuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Contactousuario(Usuario usuario, String email, String telefonoMovil, String telefonoFijo) {
		this.usuario = usuario;
		this.email = email;
		this.telefonoMovil = telefonoMovil;
		this.telefonoFijo = telefonoFijo;
	}

	public int getUsuarioIdUsuario() {
		return this.usuarioIdUsuario;
	}

	public void setUsuarioIdUsuario(int usuarioIdUsuario) {
		this.usuarioIdUsuario = usuarioIdUsuario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoMovil() {
		return this.telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getTelefonoFijo() {
		return this.telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

}
