package alert.model;

import javax.persistence.Entity;

/**
 * Carreras entity. @author MyEclipse Persistence Tools
 */
@Entity public class Carreras extends AbstractCarreras implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Carreras() {
	}

	/** minimal constructor */
	public Carreras(String id) {
		super(id);
	}

	/** full constructor */
	public Carreras(String id, Long facultad, String nombre) {
		super(id, facultad, nombre);
	}

}
