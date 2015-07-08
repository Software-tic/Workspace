package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EstudiantesMateriasHorarios entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "estudiantes_materias_horarios", schema = "zyos")
public class EstudiantesMateriasHorarios implements java.io.Serializable {

	// Fields

	private String idMateria;
	private String horaFin;
	private String horaInicio;
	private Long idDiaSemana;
	private Long idEstudiante;

	// Constructors

	/** default constructor */
	public EstudiantesMateriasHorarios() {
	}

	/** minimal constructor */
	public EstudiantesMateriasHorarios(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public EstudiantesMateriasHorarios(String idMateria, String horaFin,
			String horaInicio, Long idDiaSemana, Long idEstudiante) {
		this.idMateria = idMateria;
		this.horaFin = horaFin;
		this.horaInicio = horaInicio;
		this.idDiaSemana = idDiaSemana;
		this.idEstudiante = idEstudiante;
	}

	// Property accessors
	@Id
	@Column(name = "id_materia", unique = true, nullable = false)
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

}