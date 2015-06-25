package sac.model;

import javax.persistence.Entity;

/**
 * CarrerasDocentesFacultades entity. @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasDocentesFacultadesSAC extends
		AbstractCarrerasDocentesFacultadesSAC implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CarrerasDocentesFacultadesSAC() {
	}

	/** minimal constructor */
	public CarrerasDocentesFacultadesSAC(Long idDocente) {
		super(idDocente);
	}

	/** full constructor */
	public CarrerasDocentesFacultadesSAC(Long idDocente, String idCarrera,
			Long idFacultad) {
		super(idDocente, idCarrera, idFacultad);
	}

}
