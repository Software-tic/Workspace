package alert.model;

import javax.persistence.Entity;

/**
 * MateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity public class MateriasGrupo extends AbstractMateriasGrupo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MateriasGrupo() {
	}

	/** minimal constructor */
	public MateriasGrupo(String idMateria) {
		super(idMateria);
	}

	/** full constructor */
	public MateriasGrupo(String idMateria, Long idGrupo) {
		super(idMateria, idGrupo);
	}

}
