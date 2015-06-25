package alert.model;

/**
 * AbstractEstudiantesMateriasGrupo entity provides the base persistence
 * definition of the EstudiantesMateriasGrupo entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractEstudiantesMateriasGrupo implements
		java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idEstudiante;
	private Long idGrupo;

	// Constructors

	/** default constructor */
	public AbstractEstudiantesMateriasGrupo() {
	}

	/** minimal constructor */
	public AbstractEstudiantesMateriasGrupo(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public AbstractEstudiantesMateriasGrupo(String idMateria,
			Long idEstudiante, Long idGrupo) {
		this.idMateria = idMateria;
		this.idEstudiante = idEstudiante;
		this.idGrupo = idGrupo;
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

	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

}