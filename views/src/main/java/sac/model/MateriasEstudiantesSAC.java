package sac.model;

import javax.persistence.Entity;

/**
 * MateriasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity public class MateriasEstudiantesSAC extends AbstractMateriasEstudiantesSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MateriasEstudiantesSAC() {
	}

	/** minimal constructor */
	public MateriasEstudiantesSAC(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public MateriasEstudiantesSAC(String idMateria, Long idEstudiante) {
		super(idMateria, idEstudiante);
	}

}
