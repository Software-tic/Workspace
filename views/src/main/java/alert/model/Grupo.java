package alert.model;

import javax.persistence.Entity;

/**
 * Grupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class Grupo extends AbstractGrupo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Grupo() {
	}

	/** minimal constructor */
	public Grupo(Long idGrupo) {
		super(idGrupo);
	}

	/** full constructor */
	public Grupo(Long idGrupo, Long aula, String nombreGrupo) {
		super(idGrupo, aula, nombreGrupo);
	}

}
