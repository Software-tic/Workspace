package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GrupoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class GrupoId implements java.io.Serializable {

	// Fields

	private Long idGrupo;
	private Long aula;
	private String nombreGrupo;

	// Constructors

	/** default constructor */
	public GrupoId() {
	}

	/** minimal constructor */
	public GrupoId(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	/** full constructor */
	public GrupoId(Long idGrupo, Long aula, String nombreGrupo) {
		this.idGrupo = idGrupo;
		this.aula = aula;
		this.nombreGrupo = nombreGrupo;
	}

	// Property accessors

	@Column(name = "id_grupo", nullable = false)
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "aula")
	public Long getAula() {
		return this.aula;
	}

	public void setAula(Long aula) {
		this.aula = aula;
	}

	@Column(name = "nombre_grupo", length = 5)
	public String getNombreGrupo() {
		return this.nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GrupoId))
			return false;
		GrupoId castOther = (GrupoId) other;

		return ((this.getIdGrupo() == castOther.getIdGrupo()) || (this
				.getIdGrupo() != null && castOther.getIdGrupo() != null && this
				.getIdGrupo().equals(castOther.getIdGrupo())))
				&& ((this.getAula() == castOther.getAula()) || (this.getAula() != null
						&& castOther.getAula() != null && this.getAula()
						.equals(castOther.getAula())))
				&& ((this.getNombreGrupo() == castOther.getNombreGrupo()) || (this
						.getNombreGrupo() != null
						&& castOther.getNombreGrupo() != null && this
						.getNombreGrupo().equals(castOther.getNombreGrupo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdGrupo() == null ? 0 : this.getIdGrupo().hashCode());
		result = 37 * result
				+ (getAula() == null ? 0 : this.getAula().hashCode());
		result = 37
				* result
				+ (getNombreGrupo() == null ? 0 : this.getNombreGrupo()
						.hashCode());
		return result;
	}

}