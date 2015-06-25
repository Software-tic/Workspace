package alert.model;

import javax.persistence.Entity;

/**
 * Materias entity. @author MyEclipse Persistence Tools
 */
@Entity public class Materias extends AbstractMaterias implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Materias() {
	}

	/** minimal constructor */
	public Materias(String id) {
		super(id);
	}

	/** full constructor */
	public Materias(String id, String fechaFin, String fechaInicio,
			Long intHoraria, String nombre, Integer semestre) {
		super(id, fechaFin, fechaInicio, intHoraria, nombre, semestre);
	}

}
