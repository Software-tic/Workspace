package sac.model;

/**
 * AbstractCarreras entity provides the base persistence definition of the
 * Carreras entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCarrerasSAC implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private Long facultad;
	private String nombre;

	// Constructors

	/** default constructor */
	public AbstractCarrerasSAC() {
	}

	/** minimal constructor */
	public AbstractCarrerasSAC(String id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractCarrerasSAC(String id, Long facultad, String nombre) {
		this.id = id;
		this.facultad = facultad;
		this.nombre = nombre;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getFacultad() {
		return this.facultad;
	}

	public void setFacultad(Long facultad) {
		this.facultad = facultad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}