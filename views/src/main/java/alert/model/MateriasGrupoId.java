package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MateriasGrupoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class MateriasGrupoId implements java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idGrupo;

	// Constructors

	/** default constructor */
	public MateriasGrupoId() {
	}

	/** minimal constructor */
	public MateriasGrupoId(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public MateriasGrupoId(String idMateria, Long idGrupo) {
		this.idMateria = idMateria;
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
		if (!(other instanceof MateriasGrupoId))
			return false;
		MateriasGrupoId castOther = (MateriasGrupoId) other;

		return ((this.getIdMateria() == castOther.getIdMateria()) || (this
				.getIdMateria() != null && castOther.getIdMateria() != null && this
				.getIdMateria().equals(castOther.getIdMateria())))
				&& ((this.getIdGrupo() == castOther.getIdGrupo()) || (this
						.getIdGrupo() != null && castOther.getIdGrupo() != null && this
						.getIdGrupo().equals(castOther.getIdGrupo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdMateria() == null ? 0 : this.getIdMateria().hashCode());
		result = 37 * result
				+ (getIdGrupo() == null ? 0 : this.getIdGrupo().hashCode());
		return result;
	}

}