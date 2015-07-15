package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DocenteMateriaGrupoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class DocenteMateriaGrupoId implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private Long idGrupo;
	private String idMateria;

	// Constructors

	/** default constructor */
	public DocenteMateriaGrupoId() {
	}

	/** minimal constructor */
	public DocenteMateriaGrupoId(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public DocenteMateriaGrupoId(Long idDocente, Long idGrupo, String idMateria) {
		this.idDocente = idDocente;
		this.idGrupo = idGrupo;
		this.idMateria = idMateria;
	}

	// Property accessors

	@Column(name = "id_docente", nullable = false)
	public Long getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	@Column(name = "id_grupo")
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "id_materia", length = 5)
	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DocenteMateriaGrupoId))
			return false;
		DocenteMateriaGrupoId castOther = (DocenteMateriaGrupoId) other;

		return ((this.getIdDocente() == castOther.getIdDocente()) || (this
				.getIdDocente() != null && castOther.getIdDocente() != null && this
				.getIdDocente().equals(castOther.getIdDocente())))
				&& ((this.getIdGrupo() == castOther.getIdGrupo()) || (this
						.getIdGrupo() != null && castOther.getIdGrupo() != null && this
						.getIdGrupo().equals(castOther.getIdGrupo())))
				&& ((this.getIdMateria() == castOther.getIdMateria()) || (this
						.getIdMateria() != null
						&& castOther.getIdMateria() != null && this
						.getIdMateria().equals(castOther.getIdMateria())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdDocente() == null ? 0 : this.getIdDocente().hashCode());
		result = 37 * result
				+ (getIdGrupo() == null ? 0 : this.getIdGrupo().hashCode());
		result = 37 * result
				+ (getIdMateria() == null ? 0 : this.getIdMateria().hashCode());
		return result;
	}

}