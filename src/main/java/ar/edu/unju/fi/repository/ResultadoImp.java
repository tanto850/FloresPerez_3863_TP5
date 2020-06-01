package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.FloresPerez3863Tp5Application;
import ar.edu.unju.fi.model.Resultado;


/**
 * @author Antonela Flores Pérez
 *
 */
@Repository ("resultadoImp")
public class ResultadoImp implements IResultado {
	
	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(FloresPerez3863Tp5Application.class);

	@Override
	public void guardar() {
		// acción ejecutada para guardar un objeto resultado
		LOG.info("El resultado fue guardado " + resultado.getFecha() + ", " + resultado.getEquipo1() + ", " + resultado.getEquipo2());

	}

	@Override
	public Resultado mostrar() {
		// se recuperan todos los datos del resultado
		LOG.info("Mostrar los datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto resultado
		LOG.info("Se elimino el resultado");

	}

	@Override
	public Resultado modificar() {
		// se modifica los datos del resultado
		return resultado;
	}

}