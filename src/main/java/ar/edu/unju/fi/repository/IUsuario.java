package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author Antonela Flores Pérez
 *
 */
public interface IUsuario {
	
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}
