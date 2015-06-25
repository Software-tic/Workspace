package alert.model;

import javax.persistence.Entity;

/**
 * EstudiantesMateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class EstudiantesMateriasGrupo extends AbstractEstudiantesMateriasGrupo
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EstudiantesMateriasGrupo() {
	}

	/** minimal constructor */
	public EstudiantesMateriasGrupo(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public EstudiantesMateriasGrupo(String idMateria, Long idEstudiante,
			Long idGrupo) {
		super(idMateria, idEstudiante, idGrupo);
	}

}
