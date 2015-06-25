package sac.model;

import javax.persistence.Entity;

/**
 * CarrerasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasEstudiantesSAC extends AbstractCarrerasEstudiantesSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CarrerasEstudiantesSAC() {
	}

	/** minimal constructor */
	public CarrerasEstudiantesSAC(Long idEstudiante) {
		super(idEstudiante);
	}

	/** full constructor */
	public CarrerasEstudiantesSAC(Long idEstudiante, String codAlumno,
			String idCarrera) {
		super(idEstudiante, codAlumno, idCarrera);
	}

}
