package sac.model;

import javax.persistence.Entity;

/**
 * DocentesMaterias entity. @author MyEclipse Persistence Tools
 */
@Entity public class DocentesMateriasSAC extends AbstractDocentesMateriasSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DocentesMateriasSAC() {
	}

	/** minimal constructor */
	public DocentesMateriasSAC(Long idDocente) {
		super(idDocente);
	}

	/** full constructor */
	public DocentesMateriasSAC(Long idDocente, String idMateria) {
		super(idDocente, idMateria);
	}

}
