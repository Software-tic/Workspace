package alert.model;

/**
 * AbstractDocentesMaterias entity provides the base persistence definition of
 * the DocentesMaterias entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDocentesMaterias implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private String idMateria;

	// Constructors

	/** default constructor */
	public AbstractDocentesMaterias() {
	}

	/** minimal constructor */
	public AbstractDocentesMaterias(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public AbstractDocentesMaterias(Long idDocente, String idMateria) {
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