package alert.model;

import javax.persistence.Entity;

/**
 * DocentesMaterias entity. @author MyEclipse Persistence Tools
 */
@Entity public class DocentesMaterias extends AbstractDocentesMaterias implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DocentesMaterias() {
	}

	/** minimal constructor */
	public DocentesMaterias(Long idDocente) {
		super(idDocente);
	}

	/** full constructor */
	public DocentesMaterias(Long idDocente, String idMateria) {
		super(idDocente, idMateria);
	}

}
