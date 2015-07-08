package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CarrerasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "carreras_estudiantes", schema = "zyos")
public class CarrerasEstudiantes implements java.io.Serializable {

	// Fields

	private Long idEstudiante;
	private String codAlumno;
	private String idCarrera;

	// Constructors

	/** default constructor */
	public CarrerasEstudiantes() {
	}

	/** minimal constructor */
	public CarrerasEstudiantes(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	/** full constructor */
	public CarrerasEstudiantes(Long idEstudiante, String codAlumno,
			String idCarrera) {
		this.idEstudiante = idEstudiante;
		this.codAlumno = codAlumno;
		this.idCarrera = idCarrera;
	}

	// Property accessors
	@Id
	@Column(name = "id_estudiante", unique = true, nullable = false)
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

}