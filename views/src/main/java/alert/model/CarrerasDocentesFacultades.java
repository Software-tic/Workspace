package alert.model;

import javax.persistence.Entity;

/**
 * CarrerasDocentesFacultades entity. @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasDocentesFacultades extends
		AbstractCarrerasDocentesFacultades implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CarrerasDocentesFacultades() {
	}

	/** minimal constructor */
	public CarrerasDocentesFacultades(Long idDocente) {
		super(idDocente);
	}

	/** full constructor */
	public CarrerasDocentesFacultades(Long idDocente, String idCarrera,
			Long idFacultad) {
		super(idDocente, idCarrera, idFacultad);
	}

}
