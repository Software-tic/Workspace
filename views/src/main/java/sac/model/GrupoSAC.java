package sac.model;

import javax.persistence.Entity;

/**
 * Grupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class GrupoSAC extends AbstractGrupoSAC implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrupoSAC() {
	}

	/** minimal constructor */
	public GrupoSAC(Long idGrupo) {
		super(idGrupo);
	}

	/** full constructor */
	public GrupoSAC(Long idGrupo, Long aula, String nombreGrupo) {
		super(idGrupo, aula, nombreGrupo);
	}

}
