package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Antonela Flores Pérez
 *
 */
public interface IResultado {
	
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
