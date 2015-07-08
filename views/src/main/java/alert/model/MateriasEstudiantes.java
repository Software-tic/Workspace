package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MateriasEstudiantes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "materias_estudiantes", schema = "zyos")
public class MateriasEstudiantes implements java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idEstudiante;

	// Constructors

	/** default constructor */
	public MateriasEstudiantes() {
	}

	/** minimal constructor */
	public MateriasEstudiantes(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public MateriasEstudiantes(String idMateria, Long idEstudiante) {
		this.idMateria = idMateria;
		this.idEstudiante = idEstudiante;
	}

	// Property accessors
	@Id
	@Column(name = "id_materia", unique = true, nullable = false, length = 5)
	public String getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	@Column(name = "id_estudiante")
	public Long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

}