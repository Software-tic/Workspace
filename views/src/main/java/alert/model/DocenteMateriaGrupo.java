package alert.model;

import javax.persistence.Entity;

/**
 * DocenteMateriaGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class DocenteMateriaGrupo extends AbstractDocenteMateriaGrupo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DocenteMateriaGrupo() {
	}

	/** minimal constructor */
	public DocenteMateriaGrupo(Long idDocente) {
		super(idDocente);
	}

	/** full constructor */
	public DocenteMateriaGrupo(Long idDocente, Long idGrupo, String idMateria) {
		super(idDocente, idGrupo, idMateria);
	}

}
