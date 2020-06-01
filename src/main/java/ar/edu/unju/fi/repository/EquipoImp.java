package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.FloresPerez3863Tp5Application;
import ar.edu.unju.fi.model.Equipo;


/**
 * @author Antonela Flores Pérez
 *
 */
@Repository ("equipoImp")
public class EquipoImp implements IEquipo {
	
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(FloresPerez3863Tp5Application.class);

	@Override
	public void guardar() {
		// acción ejecutada para guardar un objeto equipo
		LOG.info("El equipo fue guardado " + equipo.getNombre() + ", " + equipo.getEstadio());

	}

	@Override
	public Equipo mostrar() {
		// se recuperan todos los datos del equipo
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto equipo
		LOG.info("Se elimino el equipo");

	}

	@Override
	public Equipo modificar() {
		// se modifica los datos del equipo
		return equipo;
	}

}