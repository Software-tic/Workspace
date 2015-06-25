package sac.model;

import javax.persistence.Entity;

/**
 * Facultades entity. @author MyEclipse Persistence Tools
 */
@Entity public class FacultadesSAC extends AbstractFacultadesSAC implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FacultadesSAC() {
	}

	/** minimal constructor */
	public FacultadesSAC(Long identificador) {
		super(identificador);
	}

	/** full constructor */
	public FacultadesSAC(Long identificador, String facultad) {
		super(identificador, facultad);
	}

}
