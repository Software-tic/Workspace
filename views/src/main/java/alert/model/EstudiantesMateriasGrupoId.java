package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EstudiantesMateriasGrupoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class EstudiantesMateriasGrupoId implements java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idEstudiante;
	private Long idGrupo;

	// Constructors

	/** default constructor */
	public EstudiantesMateriasGrupoId() {
	}

	/** minimal constructor */
	public EstudiantesMateriasGrupoId(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public EstudiantesMateriasGrupoId(String idMateria, Long idEstudiante,
			Long idGrupo) {
		this.idMateria = idMateria;
		this.idEstudiante = idEstudiante;
		this.idGrupo = idGrupo;
	}

	// Property accessors

	@Column(name = "id_materia", nullable = false, length = 5)
	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	@Column(name = "id_estudiante")
	public Long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Column(name = "id_grupo")
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstudiantesMateriasGrupoId))
			return false;
		EstudiantesMateriasGrupoId castOther = (EstudiantesMateriasGrupoId) other;

		return ((this.getIdMateria() == castOther.getIdMateria()) || (this
				.getIdMateria() != null && castOther.getIdMateria() != null && this
				.getIdMateria().equals(castOther.getIdMateria())))
				&& ((this.getIdEstudiante() == castOther.getIdEstudiante()) || (this
						.getIdEstudiante() != null
						&& castOther.getIdEstudiante() != null && this
						.getIdEstudiante().equals(castOther.getIdEstudiante())))
				&& ((this.getIdGrupo() == castOther.getIdGrupo()) || (this
						.getIdGrupo() != null && castOther.getIdGrupo() != null && this
						.getIdGrupo().equals(castOther.getIdGrupo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdMateria() == null ? 0 : this.getIdMateria().hashCode());
		result = 37
				* result
				+ (getIdEstudiante() == null ? 0 : this.getIdEstudiante()
						.hashCode());
		result = 37 * result
				+ (getIdGrupo() == null ? 0 : this.getIdGrupo().hashCode());
		return result;
	}

}