package sac.model;

import javax.persistence.Entity;

/**
 * Horarios entity. @author MyEclipse Persistence Tools
 */
@Entity public class HorariosSAC extends AbstractHorariosSAC implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HorariosSAC() {
	}

	/** minimal constructor */
	public HorariosSAC(String materia) {
		super(materia);
	}

	/** full constructor */
	public HorariosSAC(String materia, String diaDeClase, Long grupo) {
		super(materia, diaDeClase, grupo);
	}

}
