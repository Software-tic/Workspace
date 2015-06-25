package alert.model;

/**
 * AbstractFacultades entity provides the base persistence definition of the
 * Facultades entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFacultades implements java.io.Serializable {

	// Fields

	private Long identificador;
	private String facultad;

	// Constructors

	/** default constructor */
	public AbstractFacultades() {
	}

	/** minimal constructor */
	public AbstractFacultades(Long identificador) {
		this.identificador = identificador;
	}

	/** full constructor */
	public AbstractFacultades(Long identificador, String facultad) {
		this.identificador = identificador;
		this.facultad = facultad;
	}

	// Property accessors

	public Long getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getFacultad() {
		return this.facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

}