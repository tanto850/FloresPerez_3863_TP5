package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.FloresPerez3863Tp5Application;
import ar.edu.unju.fi.model.Estadio;


/**
 * @author Antonela Flores Pérez
 *
 */
@Repository ("equipoImp")
public class EstadioImp implements IEstadio {
	
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(FloresPerez3863Tp5Application.class);

	@Override
	public void guardar() {
		// acción ejecutada para guardar un objeto estadio
		LOG.info("El equipo fue guardado " + estadio.getNombre() + ", " + estadio.getCiudad());

	}

	@Override
	public Estadio mostrar() {
		// se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto estadio
		LOG.info("Se elimino el estadio");

	}

	@Override
	public Estadio modificar() {
		// se modifica los datos del estadio
		return estadio;
	}

}