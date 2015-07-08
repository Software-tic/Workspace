package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EstudiantesMateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "estudiantes_materias_grupo", schema = "zyos")
public class EstudiantesMateriasGrupo implements java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idEstudiante;
	private Long idGrupo;

	// Constructors

	/** default constructor */
	public EstudiantesMateriasGrupo() {
	}

	/** minimal constructor */
	public EstudiantesMateriasGrupo(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public EstudiantesMateriasGrupo(String idMateria, Long idEstudiante,
			Long idGrupo) {
		this.idMateria = idMateria;
		this.idEstudiante = idEstudiante;
		this.idGrupo = idGrupo;
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

	@Column(name = "id_grupo")
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

}