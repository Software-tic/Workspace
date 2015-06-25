package sac.model;

import javax.persistence.Entity;

/**
 * MateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class MateriasGrupoSAC extends AbstractMateriasGrupoSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MateriasGrupoSAC() {
	}

	/** minimal constructor */
	public MateriasGrupoSAC(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public MateriasGrupoSAC(String idMateria, Long idGrupo) {
		super(idMateria, idGrupo);
	}

}
