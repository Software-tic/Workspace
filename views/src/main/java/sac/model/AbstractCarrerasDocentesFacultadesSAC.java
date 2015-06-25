package sac.model;

/**
 * AbstractCarrerasDocentesFacultades entity provides the base persistence
 * definition of the CarrerasDocentesFacultades entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractCarrerasDocentesFacultadesSAC implements
		java.io.Serializable {

	// Fields

	private Long idDocente;
	private String idCarrera;
	private Long idFacultad;

	// Constructors

	/** default constructor */
	public AbstractCarrerasDocentesFacultadesSAC() {
	}

	/** minimal constructor */
	public AbstractCarrerasDocentesFacultadesSAC(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public AbstractCarrerasDocentesFacultadesSAC(Long idDocente, String idCarrera,
			Long idFacultad) {
		this.idDocente = idDocente;
		this.idCarrera = idCarrera;
		this.idFacultad = idFacultad;
	}

	// Property accessors

	public Long getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	public String getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	public Long getIdFacultad() {
		return this.idFacultad;
	}

	public void setIdFacultad(Long idFacultad) {
		this.idFacultad = idFacultad;
	}

}