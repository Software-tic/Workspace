package sac.model;

import javax.persistence.Entity;

/**
 * DecanoFacultad entity. @author MyEclipse Persistence Tools
 */
@Entity public class DecanoFacultadSAC extends AbstractDecanoFacultadSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DecanoFacultadSAC() {
	}

	/** minimal constructor */
	public DecanoFacultadSAC(Long idDecano) {
		super(idDecano);
	}

	/** full constructor */
	public DecanoFacultadSAC(Long idDecano, Long idFacultad, String mail,
			String nomDecano) {
		super(idDecano, idFacultad, mail, nomDecano);
	}

}
