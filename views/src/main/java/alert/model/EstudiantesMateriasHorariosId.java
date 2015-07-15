package alert.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EstudiantesMateriasHorariosId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class EstudiantesMateriasHorariosId implements java.io.Serializable {

	// Fields

	private String idMateria;
	private String horaFin;
	private String horaInicio;
	private Long idDiaSemana;
	private Long idEstudiante;

	// Constructors

	/** default constructor */
	public EstudiantesMateriasHorariosId() {
	}

	/** minimal constructor */
	public EstudiantesMateriasHorariosId(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public EstudiantesMateriasHorariosId(String idMateria, String horaFin,
			String horaInicio, Long idDiaSemana, Long idEstudiante) {
		this.idMateria = idMateria;
		this.horaFin = horaFin;
		this.horaInicio = horaInicio;
		this.idDiaSemana = idDiaSemana;
		this.idEstudiante = idEstudiante;
	}

	// Property accessors

	@Column(name = "id_materia", nullable = false)
	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	@Column(name = "hora_fin")
	public String getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	@Column(name = "hora_inicio")
	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Column(name = "id_dia_semana")
	public Long getIdDiaSemana() {
		return this.idDiaSemana;
	}

	public void setIdDiaSemana(Long idDiaSemana) {
		this.idDiaSemana = idDiaSemana;
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
		if (!(other instanceof EstudiantesMateriasHorariosId))
			return false;
		EstudiantesMateriasHorariosId castOther = (EstudiantesMateriasHorariosId) other;

		return ((this.getIdMateria() == castOther.getIdMateria()) || (this
				.getIdMateria() != null && castOther.getIdMateria() != null && this
				.getIdMateria().equals(castOther.getIdMateria())))
				&& ((this.getHoraFin() == castOther.getHoraFin()) || (this
						.getHoraFin() != null && castOther.getHoraFin() != null && this
						.getHoraFin().equals(castOther.getHoraFin())))
				&& ((this.getHoraInicio() == castOther.getHoraInicio()) || (this
						.getHoraInicio() != null
						&& castOther.getHoraInicio() != null && this
						.getHoraInicio().equals(castOther.getHoraInicio())))
				&& ((this.getIdDiaSemana() == castOther.getIdDiaSemana()) || (this
						.getIdDiaSemana() != null
						&& castOther.getIdDiaSemana() != null && this
						.getIdDiaSemana().equals(castOther.getIdDiaSemana())))
				&& ((this.getIdEstudiante() == castOther.getIdEstudiante()) || (this
						.getIdEstudiante() != null
						&& castOther.getIdEstudiante() != null && this
						.getIdEstudiante().equals(castOther.getIdEstudiante())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdMateria() == null ? 0 : this.getIdMateria().hashCode());
		result = 37 * result
				+ (getHoraFin() == null ? 0 : this.getHoraFin().hashCode());
		result = 37
				* result
				+ (getHoraInicio() == null ? 0 : this.getHoraInicio()
						.hashCode());
		result = 37
				* result
				+ (getIdDiaSemana() == null ? 0 : this.getIdDiaSemana()
						.hashCode());
		result = 37
				* result
				+ (getIdEstudiante() == null ? 0 : this.getIdEstudiante()
						.hashCode());
		return result;
	}

}