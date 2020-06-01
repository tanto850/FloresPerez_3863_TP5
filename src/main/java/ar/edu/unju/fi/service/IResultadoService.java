package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Antonela Flores Pérez
 *
 */
public interface IResultadoService {
	
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
