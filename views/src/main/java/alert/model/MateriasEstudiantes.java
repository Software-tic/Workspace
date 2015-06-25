package alert.model;

import javax.persistence.Entity;

/**
 * MateriasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity public class MateriasEstudiantes extends AbstractMateriasEstudiantes implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MateriasEstudiantes() {
	}

	/** minimal constructor */
	public MateriasEstudiantes(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public MateriasEstudiantes(String idMateria, Long idEstudiante) {
		super(idMateria, idEstudiante);
	}

}
