package alert.model;

import javax.persistence.Entity;

/**
 * CarrerasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasEstudiantes extends AbstractCarrerasEstudiantes implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CarrerasEstudiantes() {
	}

	/** minimal constructor */
	public CarrerasEstudiantes(Long idEstudiante) {
		super(idEstudiante);
	}

	/** full constructor */
	public CarrerasEstudiantes(Long idEstudiante, String codAlumno,
			String idCarrera) {
		super(idEstudiante, codAlumno, idCarrera);
	}

}
