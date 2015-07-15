package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DocentesMateriasId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class DocentesMateriasId implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private String idMateria;

	// Constructors

	/** default constructor */
	public DocentesMateriasId() {
	}

	/** minimal constructor */
	public DocentesMateriasId(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public DocentesMateriasId(Long idDocente, String idMateria) {
		this.idDocente = idDocente;
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
		if (!(other instanceof DocentesMateriasId))
			return false;
		DocentesMateriasId castOther = (DocentesMateriasId) other;

		return ((this.getIdDocente() == castOther.getIdDocente()) || (this
				.getIdDocente() != null && castOther.getIdDocente() != null && this
				.getIdDocente().equals(castOther.getIdDocente())))
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
				+ (getIdMateria() == null ? 0 : this.getIdMateria().hashCode());
		return result;
	}

}