package sac.model;

import javax.persistence.Entity;

/**
 * EstudiantesMateriasHorarios entity. @author MyEclipse Persistence Tools
 */
@Entity public class EstudiantesMateriasHorariosSAC extends
		AbstractEstudiantesMateriasHorariosSAC implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EstudiantesMateriasHorariosSAC() {
	}

	/** minimal constructor */
	public EstudiantesMateriasHorariosSAC(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public EstudiantesMateriasHorariosSAC(String idMateria, String horaFin,
			String horaInicio, Long idDiaSemana, Long idEstudiante) {
		super(idMateria, horaFin, horaInicio, idDiaSemana, idEstudiante);
	}

}
