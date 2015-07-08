package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MateriasGrupo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "materias_grupo", schema = "zyos")
public class MateriasGrupo implements java.io.Serializable {

	// Fields

	private String idMateria;
	private Long idGrupo;

	// Constructors

	/** default constructor */
	public MateriasGrupo() {
	}

	/** minimal constructor */
	public MateriasGrupo(String idMateria) {
		this.idMateria = idMateria;
	}

	/** full constructor */
	public MateriasGrupo(String idMateria, Long idGrupo) {
		this.idMateria = idMateria;
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

	@Column(name = "id_grupo")
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

}