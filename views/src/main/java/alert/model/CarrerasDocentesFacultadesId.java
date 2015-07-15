package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CarrerasDocentesFacultadesId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class CarrerasDocentesFacultadesId implements java.io.Serializable {

	// Fields

	private Long idDocente;
	private String idCarrera;
	private Long idFacultad;

	// Constructors

	/** default constructor */
	public CarrerasDocentesFacultadesId() {
	}

	/** minimal constructor */
	public CarrerasDocentesFacultadesId(Long idDocente) {
		this.idDocente = idDocente;
	}

	/** full constructor */
	public CarrerasDocentesFacultadesId(Long idDocente, String idCarrera,
			Long idFacultad) {
		this.idDocente = idDocente;
		this.idCarrera = idCarrera;
		this.idFacultad = idFacultad;
	}

	// Property accessors

	@Column(name = "id_docente", nullable = false)
	public Long getIdDocente() {
		return this.idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	@Column(name = "id_carrera")
	public String getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	@Column(name = "id_facultad")
	public Long getIdFacultad() {
		return this.idFacultad;
	}

	public void setIdFacultad(Long idFacultad) {
		this.idFacultad = idFacultad;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CarrerasDocentesFacultadesId))
			return false;
		CarrerasDocentesFacultadesId castOther = (CarrerasDocentesFacultadesId) other;

		return ((this.getIdDocente() == castOther.getIdDocente()) || (this
				.getIdDocente() != null && castOther.getIdDocente() != null && this
				.getIdDocente().equals(castOther.getIdDocente())))
				&& ((this.getIdCarrera() == castOther.getIdCarrera()) || (this
						.getIdCarrera() != null
						&& castOther.getIdCarrera() != null && this
						.getIdCarrera().equals(castOther.getIdCarrera())))
				&& ((this.getIdFacultad() == castOther.getIdFacultad()) || (this
						.getIdFacultad() != null
						&& castOther.getIdFacultad() != null && this
						.getIdFacultad().equals(castOther.getIdFacultad())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdDocente() == null ? 0 : this.getIdDocente().hashCode());
		result = 37 * result
				+ (getIdCarrera() == null ? 0 : this.getIdCarrera().hashCode());
		result = 37
				* result
				+ (getIdFacultad() == null ? 0 : this.getIdFacultad()
						.hashCode());
		return result;
	}

}