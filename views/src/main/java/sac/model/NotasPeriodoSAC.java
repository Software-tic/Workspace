package sac.model;

import javax.persistence.Entity;

/**
 * NotasPeriodo entity. @author MyEclipse Persistence Tools
 */
@Entity public class NotasPeriodoSAC extends AbstractNotasPeriodoSAC implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public NotasPeriodoSAC() {
	}

	/** minimal constructor */
	public NotasPeriodoSAC(Long idEstudiante, String idMateria, String periodo) {
		super(idEstudiante, idMateria, periodo);
	}

	/** full constructor */
	public NotasPeriodoSAC(Long idEstudiant, String idMateri, String primerCort, String segundoCort, String tercerCort, String Final, String period) {
		super(idEstudiant, idMateri, primerCort, segundoCort, tercerCort, Final, period);
	}

}
