package sac.model;

/**
 * AbstractDocentesMaterias entity provides the base persistence definition of
 * the DocentesMaterias entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDocentesMateriasSAC implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private String idMateria;

	// Constructors

	/** default constructor */
	public AbstractDocentesMateriasSAC() {
	}

	/** minimal constructor */
	public AbstractDocentesMateriasSAC(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public AbstractDocentesMateriasSAC(Long idDocente, String idMateria) {
		this.idDocente = idDocente;
		this.idMateria = idMateria;
	}

	// Property accessors

	public Long getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

}