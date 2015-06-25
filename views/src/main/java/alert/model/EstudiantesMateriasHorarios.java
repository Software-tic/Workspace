package alert.model;

import javax.persistence.Entity;

/**
 * EstudiantesMateriasHorarios entity. @author MyEclipse Persistence Tools
 */
@Entity public class EstudiantesMateriasHorarios extends
		AbstractEstudiantesMateriasHorarios implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EstudiantesMateriasHorarios() {
	}

	/** minimal constructor */
	public EstudiantesMateriasHorarios(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public EstudiantesMateriasHorarios(String idMateria, String horaFin,
			String horaInicio, Long idDiaSemana, Long idEstudiante) {
		super(idMateria, horaFin, horaInicio, idDiaSemana, idEstudiante);
	}

}
