package alert.model;

import javax.persistence.Entity;

/**
 * DecanoFacultad entity. @author MyEclipse Persistence Tools
 */
@Entity public class DecanoFacultad extends AbstractDecanoFacultad implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DecanoFacultad() {
	}

	/** minimal constructor */
	public DecanoFacultad(Long idDecano) {
		super(idDecano);
	}

	/** full constructor */
	public DecanoFacultad(Long idDecano, Long idFacultad, String mail,
			String nomDecano) {
		super(idDecano, idFacultad, mail, nomDecano);
	}

}
