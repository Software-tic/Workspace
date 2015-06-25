package alert.model;

/**
 * AbstractHorarios entity provides the base persistence definition of the
 * Horarios entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHorarios implements java.io.Serializable {

	// Fields

	private String materia;
	private String diaDeClase;
	private Long grupo;

	// Constructors

	/** default constructor */
	public AbstractHorarios() {
	}

	/** minimal constructor */
	public AbstractHorarios(String materia) {
		this.materia = materia;
	}

	/** full constructor */
	public AbstractHorarios(String materia, String diaDeClase, Long grupo) {
		this.materia = materia;
		this.diaDeClase = diaDeClase;
		this.grupo = grupo;
	}

	// Property accessors

	public String getMateria() {
		return this.materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getDiaDeClase() {
		return this.diaDeClase;
	}

	public void setDiaDeClase(String diaDeClase) {
		this.diaDeClase = diaDeClase;
	}

	public Long getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Long grupo) {
		this.grupo = grupo;
	}

}