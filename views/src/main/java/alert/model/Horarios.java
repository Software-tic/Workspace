package alert.model;

import javax.persistence.Entity;

/**
 * Horarios entity. @author MyEclipse Persistence Tools
 */
@Entity public class Horarios extends AbstractHorarios implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Horarios() {
	}

	/** minimal constructor */
	public Horarios(String materia) {
		super(materia);
	}

	/** full constructor */
	public Horarios(String materia, String diaDeClase, Long grupo) {
		super(materia, diaDeClase, grupo);
	}

}
