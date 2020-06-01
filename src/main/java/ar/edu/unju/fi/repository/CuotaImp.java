package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.FloresPerez3863Tp5Application;
import ar.edu.unju.fi.model.Cuota;


/**
 * @author Antonela Flores Pérez
 *
 */
@Repository ("cuotaImp")
public class CuotaImp implements ICuota {
	
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(FloresPerez3863Tp5Application.class);

	@Override
	public void guardar() {
		// acción ejecutada para guardar un objeto cuota
		LOG.info("La cuota fue guardada " + cuota.getUsuario() + ", " + cuota.getMonto());

	}

	@Override
	public Cuota mostrar() {
		// se recuperan todos los datos de la cuota
		LOG.info("Mostrar los datos del usuario");
		return cuota;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto
		LOG.info("Se elimino la cuota");

	}

	@Override
	public Cuota modificar() {
		// se modifica los datos de la cuota
		return cuota;
	}

}