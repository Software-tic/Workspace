package sac.model;

import javax.persistence.Entity;

/**
 * Carreras entity. @author MyEclipse Persistence Tools
 */
@Entity public class CarrerasSAC extends AbstractCarrerasSAC implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public CarrerasSAC() {
	}

	/** minimal constructor */
	public CarrerasSAC(String id) {
		super(id);
	}

	/** full constructor */
	public CarrerasSAC(String id, Long facultad, String nombre) {
		super(id, facultad, nombre);
	}

}
