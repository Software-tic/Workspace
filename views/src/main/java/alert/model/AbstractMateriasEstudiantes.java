package alert.model;

/**
 * AbstractMateriasEstudiantes entity provides the base persistence definition
 * of the MateriasEstudiantes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMateriasEstudiantes implements
		java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idEstudiante;

	// Constructors

	/** default constructor */
	public AbstractMateriasEstudiantes() {
	}

	/** minimal constructor */
	public AbstractMateriasEstudiantes(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public AbstractMateriasEstudiantes(String idMateria, Long idEstudiante) {
		this.idMateria = idMateria;
		this.idEstudiante = idEstudiante;
	}

	// Property accessors

	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	public Long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

}