package vista;

import javax.transaction.Transaction;

import org.hibernate.Session;

import datos.configuracion.Conexion;
import datos.dao.AutorDAO;
import datos.dao.ContactousuarioDAO;
import datos.dao.EjemplarDAO;
import datos.dao.LibroDAO;
import datos.dao.UsuarioDAO;
import modelo.entidades.Autor;
import modelo.entidades.Contactousuario;
import modelo.entidades.Ejemplar;
import modelo.entidades.Libro;
import modelo.entidades.Prestamo;
import modelo.entidades.Usuario;

public class Ejercicio {

	public static void main(String[] args) {
		Transaction t = null;
		try(Session session = Conexion.obtenerSesion()){
			
		Autor autor1 = new Autor(1, "Santiago", "Posteguillo");
		insertarAutor(autor1);
		Libro libro1 = new Libro("8498725410", "Las legiones malditas", "Zeta Bolsillo");
		insertarLibro(libro1);
		Ejemplar ejemplar1 = new Ejemplar(1, libro1, 2);
		insertarEjemplar(ejemplar1);
		eliminarEjemplar(ejemplar1);
		Contactousuario contacto1 = null;
		Usuario usuario1 = null;
		usuario1 = new Usuario(1, "Daniel", "Blanco",contacto1);
		contacto1 = new Contactousuario(usuario1, "correo1@gmail.com", "666555444", "981234567");
		}
	
	}
	public static void insertarAutor(Autor autor) {
		AutorDAO autorDAO = new AutorDAO();
		autorDAO.Insertar(autor);
	}
	
	public static void insertarLibro(Libro libro) {
		LibroDAO libroDAO = new LibroDAO();
		libroDAO.Insertar(libro);
	}
	public static void insertarEjemplar(Ejemplar ejemplar) {
		EjemplarDAO ejemplarDAO = new EjemplarDAO();
		ejemplarDAO.Insertar(ejemplar);
	}
	public static void eliminarEjemplar(Ejemplar ejemplar) {
		EjemplarDAO ejemplarDAO = new EjemplarDAO();
		ejemplarDAO.Eliminar(ejemplar);
	}
	public static void insertarUsuario(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.Insertar(usuario);
	}
	public static void insertarContacto(Contactousuario contactousuario) {
		ContactousuarioDAO contactousuarioDAO = new ContactousuarioDAO();
		contactousuarioDAO.Insertar(contactousuario);
	}

}
