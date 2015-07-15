package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MateriasEstudiantesId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class MateriasEstudiantesId implements java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idEstudiante;

	// Constructors

	/** default constructor */
	public MateriasEstudiantesId() {
	}

	/** minimal constructor */
	public MateriasEstudiantesId(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public MateriasEstudiantesId(String idMateria, Long idEstudiante) {
		this.idMateria = idMateria;
		this.idEstudiante = idEstudiante;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MateriasEstudiantesId))
			return false;
		MateriasEstudiantesId castOther = (MateriasEstudiantesId) other;

		return ((this.getIdMateria() == castOther.getIdMateria()) || (this
				.getIdMateria() != null && castOther.getIdMateria() != null && this
				.getIdMateria().equals(castOther.getIdMateria())))
				&& ((this.getIdEstudiante() == castOther.getIdEstudiante()) || (this
						.getIdEstudiante() != null
						&& castOther.getIdEstudiante() != null && this
						.getIdEstudiante().equals(castOther.getIdEstudiante())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdMateria() == null ? 0 : this.getIdMateria().hashCode());
		result = 37
				* result
				+ (getIdEstudiante() == null ? 0 : this.getIdEstudiante()
						.hashCode());
		return result;
	}

}