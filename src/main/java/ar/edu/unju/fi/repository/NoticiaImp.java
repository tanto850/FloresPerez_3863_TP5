package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.FloresPerez3863Tp5Application;
import ar.edu.unju.fi.model.Noticia;


/**
 * @author Antonela Flores Pérez
 *
 */
@Repository ("noticiaImp")
public class NoticiaImp implements INoticia {
	
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(FloresPerez3863Tp5Application.class);

	@Override
	public void guardar() {
		// acción ejecutada para guardar un objeto noticia
		LOG.info("La noticia fue guardada " + noticia.getTitulo() + ", " + noticia.getFecha());

	}

	@Override
	public Noticia mostrar() {
		// se recuperan todos los datos de la noticia
		LOG.info("Mostrar los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto
		LOG.info("Se elimino la noticia");

	}

	@Override
	public Noticia modificar() {
		// se modifica los datos de la noticia
		return noticia;
	}

}