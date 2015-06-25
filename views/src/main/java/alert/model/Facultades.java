package alert.model;

import javax.persistence.Entity;

/**
 * Facultades entity. @author MyEclipse Persistence Tools
 */
@Entity public class Facultades extends AbstractFacultades implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Facultades() {
	}

	/** minimal constructor */
	public Facultades(Long identificador) {
		super(identificador);
	}

	/** full constructor */
	public Facultades(Long identificador, String facultad) {
		super(identificador, facultad);
	}

}
