package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HorariosId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class HorariosId implements java.io.Serializable {

	// Fields

	private String materia;
	private String diaDeClase;
	private Long grupo;

	// Constructors

	/** default constructor */
	public HorariosId() {
	}

	/** minimal constructor */
	public HorariosId(String materia) {
		this.materia = materia;
	}

	/** full constructor */
	public HorariosId(String materia, String diaDeClase, Long grupo) {
		this.materia = materia;
		this.diaDeClase = diaDeClase;
		this.grupo = grupo;
	}

	// Property accessors

	@Column(name = "materia", nullable = false, length = 5)
	public String getMateria() {
		return this.materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Column(name = "dia_de_clase", length = 9)
	public String getDiaDeClase() {
		return this.diaDeClase;
	}

	public void setDiaDeClase(String diaDeClase) {
		this.diaDeClase = diaDeClase;
	}

	@Column(name = "grupo")
	public Long getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Long grupo) {
		this.grupo = grupo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HorariosId))
			return false;
		HorariosId castOther = (HorariosId) other;

		return ((this.getMateria() == castOther.getMateria()) || (this
				.getMateria() != null && castOther.getMateria() != null && this
				.getMateria().equals(castOther.getMateria())))
				&& ((this.getDiaDeClase() == castOther.getDiaDeClase()) || (this
						.getDiaDeClase() != null
						&& castOther.getDiaDeClase() != null && this
						.getDiaDeClase().equals(castOther.getDiaDeClase())))
				&& ((this.getGrupo() == castOther.getGrupo()) || (this
						.getGrupo() != null && castOther.getGrupo() != null && this
						.getGrupo().equals(castOther.getGrupo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMateria() == null ? 0 : this.getMateria().hashCode());
		result = 37
				* result
				+ (getDiaDeClase() == null ? 0 : this.getDiaDeClase()
						.hashCode());
		result = 37 * result
				+ (getGrupo() == null ? 0 : this.getGrupo().hashCode());
		return result;
	}

}