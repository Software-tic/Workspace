package sac.model;

import javax.persistence.Entity;

/**
 * EstudiantesMateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class EstudiantesMateriasGrupoSAC extends AbstractEstudiantesMateriasGrupoSAC
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EstudiantesMateriasGrupoSAC() {
	}

	/** minimal constructor */
	public EstudiantesMateriasGrupoSAC(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public EstudiantesMateriasGrupoSAC(String idMateria, Long idEstudiante,
			Long idGrupo) {
		super(idMateria, idEstudiante, idGrupo);
	}

}
