package sac.model;

import javax.persistence.Entity;

/**
 * Materias entity. @author MyEclipse Persistence Tools
 */
@Entity public class MateriasSAC extends AbstractMateriasSAC implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MateriasSAC() {
	}

	/** minimal constructor */
	public MateriasSAC(String id) {
		super(id);
	}

	/** full constructor */
	public MateriasSAC(String id, String fechaFin, String fechaInicio,
			Long intHoraria, String nombre, Integer semestre) {
		super(id, fechaFin, fechaInicio, intHoraria, nombre, semestre);
	}

}
