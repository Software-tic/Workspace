package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CarrerasEstudiantesId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class CarrerasEstudiantesId implements java.io.Serializable {

	// Fields

	private Long idEstudiante;
	private String codAlumno;
	private String idCarrera;

	// Constructors

	/** default constructor */
	public CarrerasEstudiantesId() {
	}

	/** minimal constructor */
	public CarrerasEstudiantesId(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/** full constructor */
	public CarrerasEstudiantesId(Long idEstudiante, String codAlumno,
			String idCarrera) {
		this.idEstudiante = idEstudiante;
		this.codAlumno = codAlumno;
		this.idCarrera = idCarrera;
	}

	// Property accessors

	@Column(name = "id_estudiante", nullable = false)
	public Long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Column(name = "cod_alumno")
	public String getCodAlumno() {
		return this.codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	@Column(name = "id_carrera")
	public String getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CarrerasEstudiantesId))
			return false;
		CarrerasEstudiantesId castOther = (CarrerasEstudiantesId) other;

		return ((this.getIdEstudiante() == castOther.getIdEstudiante()) || (this
				.getIdEstudiante() != null
				&& castOther.getIdEstudiante() != null && this
				.getIdEstudiante().equals(castOther.getIdEstudiante())))
				&& ((this.getCodAlumno() == castOther.getCodAlumno()) || (this
						.getCodAlumno() != null
						&& castOther.getCodAlumno() != null && this
						.getCodAlumno().equals(castOther.getCodAlumno())))
				&& ((this.getIdCarrera() == castOther.getIdCarrera()) || (this
						.getIdCarrera() != null
						&& castOther.getIdCarrera() != null && this
						.getIdCarrera().equals(castOther.getIdCarrera())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdEstudiante() == null ? 0 : this.getIdEstudiante()
						.hashCode());
		result = 37 * result
				+ (getCodAlumno() == null ? 0 : this.getCodAlumno().hashCode());
		result = 37 * result
				+ (getIdCarrera() == null ? 0 : this.getIdCarrera().hashCode());
		return result;
	}

}