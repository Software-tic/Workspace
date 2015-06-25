package sac.model;

import javax.persistence.Entity;

/**
 * DocenteMateriaGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class DocenteMateriaGrupoSAC extends AbstractDocenteMateriaGrupoSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DocenteMateriaGrupoSAC() {
	}

	/** minimal constructor */
	public DocenteMateriaGrupoSAC(Long idDocente) {
		super(idDocente);
	}

	/** full constructor */
	public DocenteMateriaGrupoSAC(Long idDocente, Long idGrupo, String idMateria) {
		super(idDocente, idGrupo, idMateria);
	}

}
